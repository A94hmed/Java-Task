package com.example.Employee_Application.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmailEmbeddedRequestDto {

    @NotBlank(message = "Email name is required")
    private String name;

    @NotBlank(message = "Email content is required")
    @Email(message = "Invalid email format")
    private String content;
}
