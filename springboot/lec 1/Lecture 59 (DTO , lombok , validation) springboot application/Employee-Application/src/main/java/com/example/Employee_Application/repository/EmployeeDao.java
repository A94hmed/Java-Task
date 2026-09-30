package com.example.Employee_Application.repository;

import com.example.Employee_Application.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeDao {

    Employee save(Employee employee);

    Employee update(Employee employee);

    void delete(Employee employee);

    List<Employee> findAll();

    Optional<Employee> findById(Long id);

    List<Employee> findByIds(List<Long> ids);

    List<Employee> findByNames(List<String> names);
}