package probG;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Parent parent=new Parent();
        Child child=new Child();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter n : ");
        int number=scanner.nextInt();


        child.setN(number);
        child.print();



    }
}