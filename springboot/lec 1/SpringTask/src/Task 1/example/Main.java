package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext container =
                new AnnotationConfigApplicationContext(AppConfig.class);

        PersonService personService =
                container.getBean(PersonService.class);

        MangerService mangerService =
                container.getBean(MangerService.class);

        personService.save("Ahmed");
        personService.update("Ahmed");

        mangerService.save("Mohamed");
        mangerService.update("Mohamed");
    }
}