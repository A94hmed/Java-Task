package com.example.University.repository;

import com.example.University.model.Instructor;

import java.util.List;
import java.util.Optional;

public interface InstructorRepository {

    Instructor save(Instructor instructor);

    List<Instructor> findAll();

    Optional<Instructor> findById(Long id);

    void deleteById(Long id);
}