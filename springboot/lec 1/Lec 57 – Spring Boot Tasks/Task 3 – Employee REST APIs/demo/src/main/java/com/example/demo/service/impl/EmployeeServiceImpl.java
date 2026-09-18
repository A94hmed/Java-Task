package com.example.demo.service.impl;


import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

import com.example.demo.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class EmployeeServiceImpl implements EmployeeService {



    private final EmployeeRepository repository;



    public EmployeeServiceImpl(EmployeeRepository repository){

        this.repository = repository;

    }



    @Override
    public List<Employee> getAllEmployees(){

        return repository.findAll();

    }



    @Override
    public List<Employee> getEmployeesByIds(List<Long> ids){

        return repository.findAllById(ids);

    }



    @Override
    public Employee saveEmployee(Employee employee){

        return repository.save(employee);

    }



    @Override
    public List<Employee> saveEmployees(List<Employee> employees){

        return repository.saveAll(employees);

    }



    @Override
    public Employee updateEmployee(Long id, Employee employee){


        Employee oldEmployee =
                repository.findById(id).orElse(null);


        if(oldEmployee != null){

            oldEmployee.setName(employee.getName());

            oldEmployee.setAge(employee.getAge());

            oldEmployee.setPhoneNumber(employee.getPhoneNumber());


            return repository.save(oldEmployee);

        }


        return null;

    }




    @Override
    public List<Employee> updateEmployees(List<Employee> employees){

        return repository.saveAll(employees);

    }





    @Override
    public void deleteAllEmployees(){

        repository.deleteAll();

    }





    @Override
    public void deleteEmployeeById(Long id){

        repository.deleteById(id);

    }





    @Override
    public void deleteEmployeesByIds(List<Long> ids){

        repository.deleteAllById(ids);

    }





    @Override
    public List<Employee> searchByName(String name){

        return repository.findByNameStartingWith(name);

    }





    @Override
    public List<Employee> searchNative(String name){

        return repository.searchNative(name);

    }





    @Override
    public List<Employee> searchJPQL(String name){

        return repository.searchJPQL(name);

    }


}