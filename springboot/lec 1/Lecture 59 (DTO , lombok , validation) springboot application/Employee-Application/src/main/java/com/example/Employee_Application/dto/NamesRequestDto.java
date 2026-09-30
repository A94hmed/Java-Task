package com.example.Employee_Application.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NamesRequestDto {

    @NotEmpty(message = "Names list must not be empty")
    private List<String> names;
}
