package problec;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Teacher teacher=new Teacher();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Id :");
teacher.setId(scanner.nextInt());
        System.out.println("Enter Name :");
teacher.setName(scanner.next());
        System.out.println("Enter Age :");
teacher.setAge(scanner.nextFloat());
        System.out.println("Enter Phonenumber :");
teacher.setPhoneNumber(scanner.next());
        System.out.println("Enter Salary :");
teacher.setSalary(scanner.nextFloat());


        System.out.println("get-id:  "+teacher.getId());
        System.out.println("get-name: "+teacher.getName());
        System.out.println("get-age: "+teacher.getAge());
        System.out.println("get-phonenumber: "+teacher.getPhoneNumber());
        System.out.println("get-salary: "+teacher.getSalary());


    }
}