package problemO;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Parent parent=new Parent();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x=scanner.nextInt();
        parent.setN(x);

    }
}