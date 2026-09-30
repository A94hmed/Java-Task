package com.example.Employee_Application.repository.impl;

import com.example.Employee_Application.entity.Email;
import com.example.Employee_Application.repository.EmailDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EmailDaoImpl implements EmailDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Email save(Email email) {
        entityManager.persist(email);
        return email;
    }

    @Override
    public Email update(Email email) {
        return entityManager.merge(email);
    }

    @Override
    public void delete(Email email) {

        if (!entityManager.contains(email)) {
            email = entityManager.merge(email);
        }

        entityManager.remove(email);
    }

    @Override
    public Optional<Email> findById(Long id) {

        return Optional.ofNullable(
                entityManager.find(Email.class, id)
        );
    }

    @Override
    public List<Email> findAll() {

        return entityManager.createQuery(
                        """
                        SELECT e
                        FROM Email e
                        LEFT JOIN FETCH e.employee
                        """,
                        Email.class
                )
                .getResultList();
    }

    @Override
    public List<Email> findByName(String name) {

        return entityManager.createQuery(
                        """
                        SELECT e
                        FROM Email e
                        LEFT JOIN FETCH e.employee
                        WHERE e.name = :name
                        """,
                        Email.class
                )
                .setParameter("name", name)
                .getResultList();
    }

    @Override
    public List<Email> findByNames(List<String> names) {

        return entityManager.createQuery(
                        """
                        SELECT e
                        FROM Email e
                        LEFT JOIN FETCH e.employee
                        WHERE e.name IN :names
                        """,
                        Email.class
                )
                .setParameter("names", names)
                .getResultList();
    }

    @Override
    public List<Email> findByContent(String content) {

        return entityManager.createQuery(
                        """
                        SELECT e
                        FROM Email e
                        LEFT JOIN FETCH e.employee
                        WHERE e.content = :content
                        """,
                        Email.class
                )
                .setParameter("content", content)
                .getResultList();
    }
}