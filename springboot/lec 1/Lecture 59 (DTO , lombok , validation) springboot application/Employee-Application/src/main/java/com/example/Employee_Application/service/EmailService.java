package com.example.Employee_Application.service;

import com.example.Employee_Application.dto.EmailRequestDto;
import com.example.Employee_Application.dto.EmailResponseDto;

import java.util.List;

public interface EmailService {

    EmailResponseDto create(
            EmailRequestDto dto
    );

    EmailResponseDto update(
            Long id,
            EmailRequestDto dto
    );

    void delete(Long id);

    List<EmailResponseDto> getAll();

    List<EmailResponseDto> getByName(
            String name
    );

    List<EmailResponseDto> getByNames(
            List<String> names
    );

    List<EmailResponseDto> getByContent(
            String content
    );
}