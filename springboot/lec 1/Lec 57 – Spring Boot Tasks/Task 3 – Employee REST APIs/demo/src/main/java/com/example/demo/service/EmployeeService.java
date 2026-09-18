package com.example.demo.service;


import com.example.demo.model.Employee;

import java.util.List;


public interface EmployeeService {


    // Get All

    List<Employee> getAllEmployees();



    // Get By List IDs

    List<Employee> getEmployeesByIds(List<Long> ids);



    // Save One

    Employee saveEmployee(Employee employee);



    // Save List

    List<Employee> saveEmployees(List<Employee> employees);



    // Update One

    Employee updateEmployee(Long id, Employee employee);



    // Update List

    List<Employee> updateEmployees(List<Employee> employees);



    // Delete All

    void deleteAllEmployees();



    // Delete By ID

    void deleteEmployeeById(Long id);



    // Delete By IDs

    void deleteEmployeesByIds(List<Long> ids);



    // Search Derived

    List<Employee> searchByName(String name);



    // Search Native

    List<Employee> searchNative(String name);



    // Search JPQL

    List<Employee> searchJPQL(String name);


}