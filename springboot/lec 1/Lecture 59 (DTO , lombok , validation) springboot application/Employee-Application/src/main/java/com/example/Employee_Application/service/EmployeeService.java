package com.example.Employee_Application.service;

import com.example.Employee_Application.dto.EmployeeRequestDto;
import com.example.Employee_Application.dto.EmployeeResponseDto;
import com.example.Employee_Application.dto.EmployeeWithEmailsRequestDto;

import java.util.List;

public interface EmployeeService {

    EmployeeResponseDto create(
            EmployeeRequestDto dto
    );

    EmployeeResponseDto createWithEmails(
            EmployeeWithEmailsRequestDto dto
    );

    EmployeeResponseDto update(
            Long id,
            EmployeeRequestDto dto
    );

    void delete(Long id);

    List<EmployeeResponseDto> getAll();

    EmployeeResponseDto getById(Long id);

    List<EmployeeResponseDto> getByIds(
            List<Long> ids
    );

    List<EmployeeResponseDto> getByNames(
            List<String> names
    );
}