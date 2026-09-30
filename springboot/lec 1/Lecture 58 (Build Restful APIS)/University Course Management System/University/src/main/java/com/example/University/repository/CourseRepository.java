package com.example.University.repository;

import com.example.University.model.Course;

import java.util.List;
import java.util.Optional;

public interface CourseRepository {

    Course save(Course course);

    List<Course> findAll();

    Optional<Course> findById(Long id);

    void deleteById(Long id);
}