package ProblemB;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
    int y= scanner.nextInt();
    Even even=new Even(y);

    even.print();




    }
}