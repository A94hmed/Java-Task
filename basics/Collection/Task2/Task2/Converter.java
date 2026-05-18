package Task2;

public class Converter {
    public int convertToInt(String value) {
        int number = 0;

        try {
            number = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number");
        }

        return number;
    }
}
