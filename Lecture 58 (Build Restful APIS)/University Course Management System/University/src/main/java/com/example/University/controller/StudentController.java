package com.example.University.controller;

import com.example.University.dto.StudentDetailsDTO;
import com.example.University.model.Student;
import com.example.University.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {

        this.studentService = studentService;
    }

    // Create Student
    @PostMapping
    public Student createStudent(
            @RequestBody Student student
    ) {

        return studentService.createStudent(student);
    }

    // Get All Students
    @GetMapping
    public List<Student> getAllStudents() {

        return studentService.getAllStudents();
    }

    // Get Student By ID
    @GetMapping("/{id}")
    public StudentDetailsDTO getStudentById(
            @PathVariable Long id
    ) {

        return studentService.getStudentById(id);
    }

    // Register Student To Course
    @PostMapping("/{studentId}/courses/{courseId}")
    public Student registerCourse(
            @PathVariable Long studentId,
            @PathVariable Long courseId
    ) {

        return studentService.registerCourse(
                studentId,
                courseId
        );
    }
}