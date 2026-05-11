package Palindrome;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }

        System.out.println(reversed);

        if (original == reversed) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    }
