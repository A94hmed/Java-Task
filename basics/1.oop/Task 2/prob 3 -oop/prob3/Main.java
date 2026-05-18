package prob3;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Application app =new Application();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number1");
        app.setNum1(scanner.nextInt());
        System.out.println("Enter a number2");
        app.setNum2(scanner.nextInt());
        System.out.println("Enter a number3");
        app.setNum3(scanner.nextInt());
app.print();
        System.out.println("Enter sum");
        System.out.println(app.getsum());




        }
    }
