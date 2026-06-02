package ProblemT;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int x= scanner.nextInt();
        for(int line=1;line<=4;line++){
            for(int space=4;space>=line;space--){
                System.out.print(" ");

            }
            for (int a=1;a<=line;a++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }


}
