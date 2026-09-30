package com.example.University.controller;

import com.example.University.dto.InstructorDetailsDTO;
import com.example.University.model.Instructor;
import com.example.University.service.InstructorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/instructors")
public class InstructorController {

    private final InstructorService instructorService;

    public InstructorController(
            InstructorService instructorService
    ) {

        this.instructorService = instructorService;
    }

    // Create Instructor
    @PostMapping
    public Instructor createInstructor(
            @RequestBody Instructor instructor
    ) {

        return instructorService.createInstructor(instructor);
    }

    // Get All Instructors
    @GetMapping
    public List<Instructor> getAllInstructors() {

        return instructorService.getAllInstructors();
    }

    // Get Instructor By ID
    @GetMapping("/{id}")
    public InstructorDetailsDTO getInstructorById(
            @PathVariable Long id
    ) {

        return instructorService.getInstructorById(id);
    }
}