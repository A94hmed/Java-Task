package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext container =
                new AnnotationConfigApplicationContext(AppConfig.class);

        PersonService personService =
                container.getBean(PersonService.class);

        personService.save("Ahmed");

        container.close();
    }
}