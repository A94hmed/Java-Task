package Task3;

public class TextProcessor {
    public String convertToUpper(String text) {
        String result = null;

        try {
            result = text.toUpperCase();
        } catch (NullPointerException e) {
            System.out.println("Error: String is null!");
        }

        return result;
    }


}
