package com.example.Employee_Application.service.impl;

import com.example.Employee_Application.dto.EmailRequestDto;
import com.example.Employee_Application.dto.EmailResponseDto;
import com.example.Employee_Application.entity.Email;
import com.example.Employee_Application.entity.Employee;
import com.example.Employee_Application.mapper.EmailMapper;
import com.example.Employee_Application.repository.EmailDao;
import com.example.Employee_Application.repository.EmployeeDao;
import com.example.Employee_Application.service.EmailService;
import com.example.Employee_Application.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class EmailServiceImpl implements EmailService {

    private final EmailDao emailDao;

    private final EmployeeDao employeeDao;

    private final EmailMapper emailMapper;

    @Override
    public EmailResponseDto create(
            EmailRequestDto dto
    ) {

        Employee employee =
                employeeDao.findById(dto.getEmployeeId())
                        .orElseThrow(
                                () ->
                                        new ResourceNotFoundException(
                                                "Employee not found with id: "
                                                        + dto.getEmployeeId()
                                        )
                        );

        Email email =
                emailMapper.toEntity(dto);

        email.setEmployee(employee);

        Email savedEmail =
                emailDao.save(email);

        return emailMapper.toDto(savedEmail);
    }

    @Override
    public EmailResponseDto update(
            Long id,
            EmailRequestDto dto
    ) {

        Email email =
                emailDao.findById(id)
                        .orElseThrow(
                                () ->
                                        new ResourceNotFoundException(
                                                "Email not found with id: " + id
                                        )
                        );

        Employee employee =
                employeeDao.findById(dto.getEmployeeId())
                        .orElseThrow(
                                () ->
                                        new ResourceNotFoundException(
                                                "Employee not found with id: "
                                                        + dto.getEmployeeId()
                                        )
                        );

        email.setName(dto.getName());
        email.setContent(dto.getContent());
        email.setEmployee(employee);

        Email updatedEmail =
                emailDao.update(email);

        return emailMapper.toDto(updatedEmail);
    }

    @Override
    public void delete(Long id) {

        Email email =
                emailDao.findById(id)
                        .orElseThrow(
                                () ->
                                        new ResourceNotFoundException(
                                                "Email not found with id: " + id
                                        )
                        );

        emailDao.delete(email);
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmailResponseDto> getAll() {

        return emailDao.findAll()
                .stream()
                .map(emailMapper::toDto)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmailResponseDto> getByName(
            String name
    ) {

        return emailDao.findByName(name)
                .stream()
                .map(emailMapper::toDto)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmailResponseDto> getByNames(
            List<String> names
    ) {

        return emailDao.findByNames(names)
                .stream()
                .map(emailMapper::toDto)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmailResponseDto> getByContent(
            String content
    ) {

        return emailDao.findByContent(content)
                .stream()
                .map(emailMapper::toDto)
                .toList();
    }
}