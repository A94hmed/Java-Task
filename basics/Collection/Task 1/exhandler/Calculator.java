package exhandler;

public class Calculator {
    public int divide(int a, int b) {
        int result = 0;

        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }

        return result;
    }
}
