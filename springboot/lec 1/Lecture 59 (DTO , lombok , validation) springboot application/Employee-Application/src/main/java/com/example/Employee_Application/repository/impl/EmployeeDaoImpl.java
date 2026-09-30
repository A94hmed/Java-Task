package com.example.Employee_Application.repository.impl;

import com.example.Employee_Application.entity.Employee;
import com.example.Employee_Application.repository.EmployeeDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Employee save(Employee employee) {
        entityManager.persist(employee);
        return employee;
    }

    @Override
    public Employee update(Employee employee) {
        return entityManager.merge(employee);
    }

    @Override
    public void delete(Employee employee) {

        if (!entityManager.contains(employee)) {
            employee = entityManager.merge(employee);
        }

        entityManager.remove(employee);
    }

    @Override
    public List<Employee> findAll() {

        return entityManager.createQuery(
                        """
                        SELECT DISTINCT e
                        FROM Employee e
                        LEFT JOIN FETCH e.emails
                        """,
                        Employee.class
                )
                .getResultList();
    }

    @Override
    public Optional<Employee> findById(Long id) {

        List<Employee> employees =
                entityManager.createQuery(
                                """
                                SELECT DISTINCT e
                                FROM Employee e
                                LEFT JOIN FETCH e.emails
                                WHERE e.id = :id
                                """,
                                Employee.class
                        )
                        .setParameter("id", id)
                        .getResultList();

        return employees.stream().findFirst();
    }

    @Override
    public List<Employee> findByIds(List<Long> ids) {

        return entityManager.createQuery(
                        """
                        SELECT DISTINCT e
                        FROM Employee e
                        LEFT JOIN FETCH e.emails
                        WHERE e.id IN :ids
                        """,
                        Employee.class
                )
                .setParameter("ids", ids)
                .getResultList();
    }

    @Override
    public List<Employee> findByNames(List<String> names) {

        return entityManager.createQuery(
                        """
                        SELECT DISTINCT e
                        FROM Employee e
                        LEFT JOIN FETCH e.emails
                        WHERE e.name IN :names
                        """,
                        Employee.class
                )
                .setParameter("names", names)
                .getResultList();
    }
}