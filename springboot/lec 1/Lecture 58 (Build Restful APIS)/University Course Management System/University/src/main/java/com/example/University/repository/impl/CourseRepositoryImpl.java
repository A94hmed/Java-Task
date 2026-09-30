package com.example.University.repository.impl;

import com.example.University.model.Course;
import com.example.University.repository.CourseRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class CourseRepositoryImpl implements CourseRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Course save(Course course) {

        if (course.getId() == null) {
            entityManager.persist(course);
            return course;
        }

        return entityManager.merge(course);
    }

    @Override
    public List<Course> findAll() {

        return entityManager
                .createQuery(
                        "SELECT DISTINCT c FROM Course c LEFT JOIN FETCH c.instructor",
                        Course.class
                )
                .getResultList();
    }

    @Override
    public Optional<Course> findById(Long id) {

        Course course = entityManager.find(Course.class, id);

        return Optional.ofNullable(course);
    }

    @Override
    public void deleteById(Long id) {

        Course course = entityManager.find(Course.class, id);

        if (course != null) {
            entityManager.remove(course);
        }
    }
}