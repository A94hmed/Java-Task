package com.example.Employee_Application.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeWithEmailsRequestDto {

    @NotBlank(message = "Employee name is required")
    private String name;

    @NotNull(message = "Age is required")
    @Min(value = 16, message = "Age must be greater than 15")
    @Max(value = 39, message = "Age must be less than 40")
    private Integer age;

    @NotNull(message = "Salary is required")
    @DecimalMin(
            value = "5000.01",
            message = "Salary must be greater than 5000"
    )
    @DecimalMax(
            value = "9999.99",
            message = "Salary must be less than 10000"
    )
    private Double salary;

    @Valid
    private List<EmailEmbeddedRequestDto> emails;
}
