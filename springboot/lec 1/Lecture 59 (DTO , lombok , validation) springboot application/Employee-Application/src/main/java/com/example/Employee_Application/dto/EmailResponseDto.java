package com.example.Employee_Application.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmailResponseDto {

    private Long id;

    private String name;

    private String content;

    private Long employeeId;
}
