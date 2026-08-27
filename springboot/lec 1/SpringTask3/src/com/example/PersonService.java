


package com.example;
public class PersonService implements UserService {

    public PersonService() {
        System.out.println("PersonService Constructor");
    }

    @Override
    public void save(String name) {
        System.out.println("Person saved: " + name);
    }

    public void init() {
        System.out.println("Init method called");
    }

    public void destroy() {
        System.out.println("Destroy method called");
    }
}
