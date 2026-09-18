package com.example.demo.controller;


import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/employees")
public class EmployeeController {



    private final EmployeeService service;



    public EmployeeController(EmployeeService service){

        this.service = service;

    }



    // 1- Get All Employees

    @GetMapping
    public List<Employee> getAllEmployees(){

        return service.getAllEmployees();

    }





    // 2- Get Employees By List Of IDs

    @PostMapping("/ids")
    public List<Employee> getEmployeesByIds(
            @RequestBody List<Long> ids){

        return service.getEmployeesByIds(ids);

    }





    // 3- Save Employee

    @PostMapping
    public Employee saveEmployee(
            @RequestBody Employee employee){

        return service.saveEmployee(employee);

    }





    // 4- Save List Of Employees

    @PostMapping("/list")
    public List<Employee> saveEmployees(
            @RequestBody List<Employee> employees){

        return service.saveEmployees(employees);

    }





    // 5- Update Employee

    @PutMapping("/{id}")
    public Employee updateEmployee(
            @PathVariable Long id,
            @RequestBody Employee employee){

        return service.updateEmployee(id, employee);

    }





    // 6- Update List Of Employees

    @PutMapping("/list")
    public List<Employee> updateEmployees(
            @RequestBody List<Employee> employees){

        return service.updateEmployees(employees);

    }





    // 7- Delete All Employees

    @DeleteMapping
    public String deleteAllEmployees(){

        service.deleteAllEmployees();

        return "All employees deleted";

    }





    // 8- Delete Employee By ID

    @DeleteMapping("/{id}")
    public String deleteEmployeeById(
            @PathVariable Long id){

        service.deleteEmployeeById(id);

        return "Employee deleted";

    }





    // 9- Delete Employees By List Of IDs

    @DeleteMapping("/ids")
    public String deleteEmployeesByIds(
            @RequestBody List<Long> ids){

        service.deleteEmployeesByIds(ids);

        return "Employees deleted";

    }





    // 10- Search By Function Name

    @GetMapping("/search/{name}")
    public List<Employee> searchByName(
            @PathVariable String name){

        return service.searchByName(name);

    }





    // Native Query

    @GetMapping("/search/native/{name}")
    public List<Employee> searchNative(
            @PathVariable String name){

        return service.searchNative(name);

    }





    // JPQL Query

    @GetMapping("/search/jpql/{name}")
    public List<Employee> searchJPQL(
            @PathVariable String name){

        return service.searchJPQL(name);

    }


}