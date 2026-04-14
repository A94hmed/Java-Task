package NumbersHistogram;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char S = sc.next().charAt(0);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();

            for (int j = 0; j < x; j++) {
                System.out.print(S);
            }

            System.out.println(); 
        }
    }
}