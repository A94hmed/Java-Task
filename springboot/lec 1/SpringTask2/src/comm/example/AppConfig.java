package comm.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PersonService personService() {
        return new PersonService();
    }

    @Bean
    public AccountServiceImpl accountServiceImpl() {
        return new AccountServiceImpl(personService());
    }
}