package ProblemP;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int x= scanner.nextInt();

int n=x;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}