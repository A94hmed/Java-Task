package com.example.Employee_Application.controller;

import com.example.Employee_Application.dto.EmployeeRequestDto;
import com.example.Employee_Application.dto.EmployeeResponseDto;
import com.example.Employee_Application.dto.EmployeeWithEmailsRequestDto;
import com.example.Employee_Application.dto.IdsRequestDto;
import com.example.Employee_Application.dto.NamesRequestDto;
import com.example.Employee_Application.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeResponseDto> create(
            @Valid
            @RequestBody EmployeeRequestDto dto
    ) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(employeeService.create(dto));
    }

    @PostMapping("/with-emails")
    public ResponseEntity<EmployeeResponseDto> createWithEmails(
            @Valid
            @RequestBody EmployeeWithEmailsRequestDto dto
    ) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(
                        employeeService.createWithEmails(dto)
                );
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmployeeResponseDto> update(
            @PathVariable Long id,
            @Valid @RequestBody EmployeeRequestDto dto
    ) {
        return ResponseEntity.ok(
                employeeService.update(id, dto)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(
            @PathVariable Long id
    ) {
        employeeService.delete(id);

        return ResponseEntity
                .noContent()
                .build();
    }

    @GetMapping
    public ResponseEntity<List<EmployeeResponseDto>> getAll() {
        return ResponseEntity.ok(
                employeeService.getAll()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeResponseDto> getById(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(
                employeeService.getById(id)
        );
    }

    @PostMapping("/search/ids")
    public ResponseEntity<List<EmployeeResponseDto>> getByIds(
            @Valid
            @RequestBody IdsRequestDto dto
    ) {
        return ResponseEntity.ok(
                employeeService.getByIds(
                        dto.getIds()
                )
        );
    }

    @PostMapping("/search/names")
    public ResponseEntity<List<EmployeeResponseDto>> getByNames(
            @Valid
            @RequestBody NamesRequestDto dto
    ) {
        return ResponseEntity.ok(
                employeeService.getByNames(
                        dto.getNames()
                )
        );
    }
}