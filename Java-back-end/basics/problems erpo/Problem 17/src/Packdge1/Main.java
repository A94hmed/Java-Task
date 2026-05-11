package Packdge1;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);

        System.out.println("Enter ID: ");
      int s =scanner.nextInt();
        System.out.println("Enter NAME: ");
        String n=scanner.next();
        System.out.println("Enter Grade: ");
        int g= scanner.nextInt();
        Student student=new Student(s,n,g);

        student.showAll();


    }
}