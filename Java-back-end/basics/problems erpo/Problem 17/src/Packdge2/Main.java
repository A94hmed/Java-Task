package Packdge2;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter ID: ");
        int s =scanner.nextInt();
        System.out.println("Enter NAME: ");
        String n=scanner.next();
        System.out.println("Enter Active: ");
        boolean a= scanner.nextBoolean();
        Teacher teacher=new Teacher(s,n,a);
        teacher.showALL();
    }
}