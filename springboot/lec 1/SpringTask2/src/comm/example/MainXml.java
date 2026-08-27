package comm.example;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXml {

    public static void main(String[] args) {

        ApplicationContext container =
                new ClassPathXmlApplicationContext("beans.xml");

        AccountServiceImpl accountService =
                container.getBean("accountServiceImpl",
                        AccountServiceImpl.class);

        accountService.getSavePerson("Ahmed");
    }
}
