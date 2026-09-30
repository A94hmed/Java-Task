package com.example.University.repository.impl;

import com.example.University.model.Instructor;
import com.example.University.repository.InstructorRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class InstructorRepositoryImpl implements InstructorRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Instructor save(Instructor instructor) {

        if (instructor.getId() == null) {
            entityManager.persist(instructor);
            return instructor;
        }

        return entityManager.merge(instructor);
    }

    @Override
    public List<Instructor> findAll() {

        return entityManager
                .createQuery(
                        "SELECT DISTINCT i FROM Instructor i LEFT JOIN FETCH i.courses",
                        Instructor.class
                )
                .getResultList();
    }

    @Override
    public Optional<Instructor> findById(Long id) {

        Instructor instructor =
                entityManager.find(Instructor.class, id);

        return Optional.ofNullable(instructor);
    }

    @Override
    public void deleteById(Long id) {

        Instructor instructor =
                entityManager.find(Instructor.class, id);

        if (instructor != null) {
            entityManager.remove(instructor);
        }
    }
}