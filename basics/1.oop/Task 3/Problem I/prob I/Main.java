package probi;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Parent parent=new Parent();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter A: ");
        int A = scanner.nextInt();

        System.out.print("Enter B: ");
        int B = scanner.nextInt();

Child child=new Child(A,B);
child.setParent();
        System.out.print(child.getAB());



    }
}