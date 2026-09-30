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
public class IdsRequestDto {

    @NotEmpty(message = "Ids list must not be empty")
    private List<Long> ids;
}