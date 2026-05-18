package probL;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Firstname: ");
        String f1=scanner.next();
        System.out.println("secondname: ");
        String s1=scanner.next();

        System.out.println("Firstname: ");
        String f2=scanner.next();
        System.out.println("secondname: ");
        String s2=scanner.next();

        Parent parent=new Parent(f1,s1);
        Child child=new Child(f2,s2);

        if (child.check(parent)) {
            System.out.println("ARE Brothers");
        } else {
            System.out.println("NOT");
        }

    }
}