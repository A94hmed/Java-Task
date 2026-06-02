package Problem14;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
        System.out.println("enter id");
int id= scanner.nextInt();
        System.out.println("enter grade");
        String grade= scanner.next();
        System.out.println("enter subject");
        String subject= scanner.next();
        System.out.println("enter assignment");
        String assignment=scanner.next();
        System.out.println("enter user");
        String user= scanner.next();
        System.out.println("enter password");
        String password = scanner.next();

        System.out.println("ID: "+id);
        System.out.println("Grade: "+grade);
        System.out.println("Subject: "+subject);
        System.out.println("Assignment: "+assignment);
        System.out.println("User: "+user);
        System.out.println("password: "+password);



    }
}