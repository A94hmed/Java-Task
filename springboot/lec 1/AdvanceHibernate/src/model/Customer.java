package model;

import javax.persistence.Entity;

@Entity
public class Customer extends User {

    private String email;

    public Customer() {

    }

    public Customer(String name, int age, String email) {

        super(name, age);
        this.email = email;

    }

    public String getEmail() {

        return email;

    }

    public void setEmail(String email) {

        this.email = email;

    }
}