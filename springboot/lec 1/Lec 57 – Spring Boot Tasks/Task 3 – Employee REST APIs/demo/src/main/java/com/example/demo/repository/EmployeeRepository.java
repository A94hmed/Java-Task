package com.example.demo.repository;


import com.example.demo.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;



public interface EmployeeRepository extends JpaRepository<Employee, Long> {



    // Function Name / Derived Query
    // Example: ahmed%
    List<Employee> findByNameStartingWith(String name);




    // Native Query

    @Query(
            value = "SELECT * FROM EMPLOYEE WHERE NAME LIKE :name",
            nativeQuery = true
    )
    List<Employee> searchNative(
            @Param("name") String name
    );





    // JPQL Non Native Query

    @Query(
            "SELECT e FROM Employee e WHERE e.name LIKE :name"
    )
    List<Employee> searchJPQL(
            @Param("name") String name
    );


}