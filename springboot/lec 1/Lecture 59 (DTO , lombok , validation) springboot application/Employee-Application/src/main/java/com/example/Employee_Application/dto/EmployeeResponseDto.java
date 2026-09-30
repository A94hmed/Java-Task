package com.example.Employee_Application.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeResponseDto {

    private Long id;

    private String name;

    private Integer age;

    private Double salary;

    private List<EmailResponseDto> emails;
}
