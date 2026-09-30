package com.example.University.controller;

import com.example.University.dto.CourseDetailsDTO;
import com.example.University.model.Course;
import com.example.University.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {

        this.courseService = courseService;
    }

    // Create Course
    @PostMapping
    public Course createCourse(
            @RequestBody Course course
    ) {

        return courseService.createCourse(course);
    }

    // Get All Courses
    @GetMapping
    public List<Course> getAllCourses() {

        return courseService.getAllCourses();
    }

    // Get Course By ID
    @GetMapping("/{id}")
    public CourseDetailsDTO getCourseById(
            @PathVariable Long id
    ) {

        return courseService.getCourseById(id);
    }

    // Assign Instructor To Course
    @PutMapping("/{courseId}/instructor/{instructorId}")
    public Course assignInstructor(
            @PathVariable Long courseId,
            @PathVariable Long instructorId
    ) {

        return courseService.assignInstructor(
                courseId,
                instructorId
        );
    }
}