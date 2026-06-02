package ProbN;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char x = scanner.next().charAt(0);

        Child child = new Child(x);
        child.Case();


    }

}