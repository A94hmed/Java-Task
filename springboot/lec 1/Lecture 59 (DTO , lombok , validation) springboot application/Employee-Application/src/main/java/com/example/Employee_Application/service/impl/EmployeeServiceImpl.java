package com.example.Employee_Application.service.impl;

import com.example.Employee_Application.dto.EmployeeRequestDto;
import com.example.Employee_Application.dto.EmployeeResponseDto;
import com.example.Employee_Application.dto.EmployeeWithEmailsRequestDto;
import com.example.Employee_Application.entity.Employee;
import com.example.Employee_Application.mapper.EmployeeMapper;
import com.example.Employee_Application.repository.EmployeeDao;
import com.example.Employee_Application.service.EmployeeService;
import com.example.Employee_Application.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeDao employeeDao;

    private final EmployeeMapper employeeMapper;

    @Override
    public EmployeeResponseDto create(
            EmployeeRequestDto dto
    ) {

        Employee employee =
                employeeMapper.toEntity(dto);

        Employee savedEmployee =
                employeeDao.save(employee);

        return employeeMapper.toDto(savedEmployee);
    }

    @Override
    public EmployeeResponseDto createWithEmails(
            EmployeeWithEmailsRequestDto dto
    ) {

        Employee employee =
                employeeMapper.toEntity(dto);

        Employee savedEmployee =
                employeeDao.save(employee);

        return employeeMapper.toDto(savedEmployee);
    }

    @Override
    public EmployeeResponseDto update(
            Long id,
            EmployeeRequestDto dto
    ) {

        Employee employee =
                employeeDao.findById(id)
                        .orElseThrow(
                                () ->
                                        new ResourceNotFoundException(
                                                "Employee not found with id: " + id
                                        )
                        );

        employee.setName(dto.getName());
        employee.setAge(dto.getAge());
        employee.setSalary(dto.getSalary());

        Employee updatedEmployee =
                employeeDao.update(employee);

        return employeeMapper.toDto(updatedEmployee);
    }

    @Override
    public void delete(Long id) {

        Employee employee =
                employeeDao.findById(id)
                        .orElseThrow(
                                () ->
                                        new ResourceNotFoundException(
                                                "Employee not found with id: " + id
                                        )
                        );

        employeeDao.delete(employee);
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmployeeResponseDto> getAll() {

        return employeeDao.findAll()
                .stream()
                .map(employeeMapper::toDto)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public EmployeeResponseDto getById(Long id) {

        Employee employee =
                employeeDao.findById(id)
                        .orElseThrow(
                                () ->
                                        new ResourceNotFoundException(
                                                "Employee not found with id: " + id
                                        )
                        );

        return employeeMapper.toDto(employee);
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmployeeResponseDto> getByIds(
            List<Long> ids
    ) {

        return employeeDao.findByIds(ids)
                .stream()
                .map(employeeMapper::toDto)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmployeeResponseDto> getByNames(
            List<String> names
    ) {

        return employeeDao.findByNames(names)
                .stream()
                .map(employeeMapper::toDto)
                .toList();
    }
}