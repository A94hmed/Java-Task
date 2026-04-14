package problemA;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Person person=new Person();
        System.out.println("enter n");
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();

        Child child=new Child(x);
      person.setN(x);


    }
}