package Task2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number as text: ");
        String text = input.nextLine();

        Converter converter = new Converter();

        int result = converter.convertToInt(text);

        System.out.println("Converted number = " + result);
    }
}