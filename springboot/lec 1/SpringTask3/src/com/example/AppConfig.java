package com.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Scope("prototype")
    public PersonService personService() {

        return new PersonService();
    }
}
