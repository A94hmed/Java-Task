package prob6;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Privateschool privateschool=new Privateschool();
        Puplicschool puplicschool=new Puplicschool();
        Student student=new Student();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a StudentId:");
        student.setId(scanner.nextInt());
        System.out.println("Enter a StudentName:");
        student.setName(scanner.next());

        student.print();
        System.out.println("get id: ");
        System.out.println(student.getId());

        System.out.println("get name: ");
        System.out.println(student.getName());










    }
}