package exhandler;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        Calculator calc = new Calculator();

        int result = calc.divide(num1, num2);

        System.out.println("Result = " + result);
    }
}