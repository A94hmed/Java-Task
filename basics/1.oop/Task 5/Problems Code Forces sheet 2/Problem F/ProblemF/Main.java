package ProblemF;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
Multiplication multiplication=new Multiplication();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
       int y=scanner.nextInt();
       multiplication.setN(y);

        scanner.close();
    }
}