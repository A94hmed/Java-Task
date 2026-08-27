package comm.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext container =
                new AnnotationConfigApplicationContext(AppConfig.class);

        AccountServiceImpl accountService =
                container.getBean(AccountServiceImpl.class);

        accountService.getSavePerson("Ahmed");
    }
}
