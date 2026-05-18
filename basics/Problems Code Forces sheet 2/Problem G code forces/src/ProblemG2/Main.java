package ProblemG2;

import ProblemG.Child;
import ProblemG.Parent;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Parent parent=new Parent();
        Scanner scanner=new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 1; t <= T; t++) {
            int N = scanner.nextInt();
            parent.setN(N);
        }


        Child child=new Child(T);


        System.out.println(parent.setN(T));

        scanner.close();

    }
}