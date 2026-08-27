package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.Bean;
public class MainXml {

    public static void main(String[] args) {

        ApplicationContext container =
                new ClassPathXmlApplicationContext("beans.xml");

        UserService personService =
                container.getBean("personService", UserService.class);

        UserService mangerService =
                container.getBean("mangerService", UserService.class);

        personService.save("Ahmed");
        personService.update("Ahmed");

        mangerService.save("Mohamed");
        mangerService.update("Mohamed");
    }
}