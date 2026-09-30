package com.example.Employee_Application.controller;

import com.example.Employee_Application.dto.EmailRequestDto;
import com.example.Employee_Application.dto.EmailResponseDto;
import com.example.Employee_Application.dto.NamesRequestDto;
import com.example.Employee_Application.service.EmailService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emails")
@RequiredArgsConstructor
public class EmailController {

    private final EmailService emailService;

    @PostMapping
    public ResponseEntity<EmailResponseDto> create(
            @Valid
            @RequestBody EmailRequestDto dto
    ) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(emailService.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmailResponseDto> update(
            @PathVariable Long id,
            @Valid @RequestBody EmailRequestDto dto
    ) {
        return ResponseEntity.ok(
                emailService.update(id, dto)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(
            @PathVariable Long id
    ) {
        emailService.delete(id);

        return ResponseEntity
                .noContent()
                .build();
    }

    @GetMapping
    public ResponseEntity<List<EmailResponseDto>> getAll() {
        return ResponseEntity.ok(
                emailService.getAll()
        );
    }

    @GetMapping("/search/name")
    public ResponseEntity<List<EmailResponseDto>> getByName(
            @RequestParam String name
    ) {
        return ResponseEntity.ok(
                emailService.getByName(name)
        );
    }

    @PostMapping("/search/names")
    public ResponseEntity<List<EmailResponseDto>> getByNames(
            @Valid
            @RequestBody NamesRequestDto dto
    ) {
        return ResponseEntity.ok(
                emailService.getByNames(
                        dto.getNames()
                )
        );
    }

    @GetMapping("/search/content")
    public ResponseEntity<List<EmailResponseDto>> getByContent(
            @RequestParam String content
    ) {
        return ResponseEntity.ok(
                emailService.getByContent(content)
        );
    }
}