package Problem9;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name: ");
        String x=scanner.next();
        System.out.println("enter age: ");
        int y= scanner.nextInt();
        Publicclup publicclup=new Publicclup(x,y);
        Privateclup privateclup=new Privateclup(x,y);
        System.out.println(publicclup.getAge());
        System.out.println(publicclup.getName());
        publicclup.print();
        privateclup.print();




    }
}