package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXml {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext container =
                new ClassPathXmlApplicationContext("beans.xml");

        PersonService personService =
                container.getBean("personService", PersonService.class);

        personService.save("Ahmed");

        container.close();
    }
}