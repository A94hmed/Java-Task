package Problem1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Parent parent=new Parent();
        Scanner scanner=new Scanner(System.in);
        System.out.println("id");
        int z=scanner.nextInt();
        System.out.println("name");
        String y= scanner.next();
        System.out.println("age");
        int c= scanner.nextInt();
        Student student=new Student(z,y,c);
        student.print();

    }
}