package com.example.Employee_Application.mapper;

import com.example.Employee_Application.dto.EmployeeRequestDto;
import com.example.Employee_Application.dto.EmployeeResponseDto;
import com.example.Employee_Application.dto.EmployeeWithEmailsRequestDto;
import com.example.Employee_Application.entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
@RequiredArgsConstructor
public class EmployeeMapper {

    private final EmailMapper emailMapper;

    public Employee toEntity(EmployeeRequestDto dto) {

        return Employee.builder()
                .name(dto.getName())
                .age(dto.getAge())
                .salary(dto.getSalary())
                .build();
    }

    public Employee toEntity(EmployeeWithEmailsRequestDto dto) {

        Employee employee = Employee.builder()
                .name(dto.getName())
                .age(dto.getAge())
                .salary(dto.getSalary())
                .build();

        if (dto.getEmails() != null) {

            dto.getEmails().forEach(emailDto ->
                    employee.addEmail(
                            emailMapper.toEntity(emailDto)
                    )
            );
        }

        return employee;
    }

    public EmployeeResponseDto toDto(Employee employee) {

        return EmployeeResponseDto.builder()
                .id(employee.getId())
                .name(employee.getName())
                .age(employee.getAge())
                .salary(employee.getSalary())
                .emails(
                        employee.getEmails() == null
                                ? Collections.emptyList()
                                : employee.getEmails()
                                .stream()
                                .map(emailMapper::toDto)
                                .toList()
                )
                .build();
    }
}