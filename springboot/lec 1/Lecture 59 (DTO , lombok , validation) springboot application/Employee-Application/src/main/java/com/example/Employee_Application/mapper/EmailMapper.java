package com.example.Employee_Application.mapper;

import com.example.Employee_Application.dto.EmailEmbeddedRequestDto;
import com.example.Employee_Application.dto.EmailRequestDto;
import com.example.Employee_Application.dto.EmailResponseDto;
import com.example.Employee_Application.entity.Email;
import org.springframework.stereotype.Component;
@Component
public class EmailMapper {

    public Email toEntity(EmailRequestDto dto) {

        return Email.builder()
                .name(dto.getName())
                .content(dto.getContent())
                .build();
    }

    public Email toEntity(EmailEmbeddedRequestDto dto) {

        return Email.builder()
                .name(dto.getName())
                .content(dto.getContent())
                .build();
    }

    public EmailResponseDto toDto(Email email) {

        return EmailResponseDto.builder()
                .id(email.getId())
                .name(email.getName())
                .content(email.getContent())
                .employeeId(
                        email.getEmployee() != null
                                ? email.getEmployee().getId()
                                : null
                )
                .build();
    }
}
