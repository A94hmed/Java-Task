package com.java;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
App app=new App();
Scanner scanner =new Scanner(System.in);
System.out.println("Enter a number ");
app.setNumber(scanner.nextInt());
        System.out.println("Enter a name ");
app.setName(scanner.next());

        app.print();

    }
}