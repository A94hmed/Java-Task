package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;


@Entity
@Table(name="EMPLOYEE")
public class Employee {


    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "emp_seq"
    )
    @SequenceGenerator(
            name = "emp_seq",
            sequenceName = "EMP_SEQ",
            allocationSize = 1
    )
    private Long id;


    private String name;


    private int age;


    private String phoneNumber;



    public Employee(){

    }



    public Employee(String name, int age, String phoneNumber){

        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;

    }



    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }



    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }



    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}