package com.example.University.repository.impl;

import com.example.University.model.Student;
import com.example.University.repository.StudentRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class StudentRepositoryImpl implements StudentRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Student save(Student student) {

        if (student.getId() == null) {
            entityManager.persist(student);
            return student;
        }

        return entityManager.merge(student);
    }

    @Override
    public List<Student> findAll() {

        return entityManager
                .createQuery(
                        "SELECT DISTINCT s FROM Student s LEFT JOIN FETCH s.courses",
                        Student.class
                )
                .getResultList();
    }

    @Override
    public Optional<Student> findById(Long id) {

        Student student = entityManager.find(Student.class, id);

        return Optional.ofNullable(student);
    }

    @Override
    public void deleteById(Long id) {

        Student student = entityManager.find(Student.class, id);

        if (student != null) {
            entityManager.remove(student);
        }
    }
}