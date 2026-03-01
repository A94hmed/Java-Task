package probH;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
Division division=new Division();


        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter A");
        double A=scanner.nextDouble();
        System.out.println("Enter B");
        double B=scanner.nextDouble();

        Calculator calculator= new Calculator(A,B);
        calculator.print();

    }
}