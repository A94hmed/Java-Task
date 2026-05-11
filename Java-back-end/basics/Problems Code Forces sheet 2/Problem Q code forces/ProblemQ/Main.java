package ProblemQ;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int x= scanner.nextInt(); //total

for(int i=0;i<x;i++){
    int n= scanner.nextInt();


while(n>0){
    int digit=n%10;
    System.out.print(digit+" ");
    n=n/10;
}
}
        System.out.println();

    }
}