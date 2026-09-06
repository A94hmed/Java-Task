package model;

import javax.persistence.Entity;

@Entity
public class Admin extends User {

    private String role;

    public Admin() {

    }

    public Admin(String name, int age, String role) {

        super(name, age);
        this.role = role;

    }

    public String getRole() {

        return role;

    }

    public void setRole(String role) {

        this.role = role;

    }
}