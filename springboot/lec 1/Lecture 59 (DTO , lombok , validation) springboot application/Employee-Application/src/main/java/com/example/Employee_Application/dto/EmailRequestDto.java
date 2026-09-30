package com.example.Employee_Application.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmailRequestDto {

    @NotBlank(message = "Email name is required")
    private String name;

    @NotBlank(message = "Email content is required")
    @Email(message = "Invalid email format")
    private String content;

    @NotNull(message = "Employee id is required")
    private Long employeeId;
}
