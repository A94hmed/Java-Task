package Problem.main;

import ProblemD.Child;
import ProblemD.Parent;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Parent parent= new Parent();
        Child child=new Child();
        while(scanner.hasNextInt()) {

            int a = scanner.nextInt();

            if (parent.getX(a)) {

                break;
            }


        }
        scanner.close();
    }
}