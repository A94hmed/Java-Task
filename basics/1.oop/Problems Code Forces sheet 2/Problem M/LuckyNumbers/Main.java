package LuckyNumbers;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        boolean found = false;

        for (int i = A; i <= B; i++) {

            int num = i;
            boolean isLucky = true;

            while (num > 0) {
                int digit = num % 10;

                if (digit != 4 && digit != 7) {
                    isLucky = false;
                    break;
                }

                num /= 10;
            }

            if (isLucky) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("-1");
        }
    }
}