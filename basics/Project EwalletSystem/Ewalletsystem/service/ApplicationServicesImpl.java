package Ewalletsystem.service;

import java.util.Scanner;

public class ApplicationServicesImpl implements ApplicationServices {
    @Override
  public void start()
    {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        boolean Exit = false;


        while (true) {
            System.out.println("Hello");
            System.out.println("what do you need");
            System.out.println("1.signup  2.signin 3.exit");

            int choose = scanner.nextInt();


            switch (choose) {
                case 1:
                    System.out.println("1.signup feature");
                    break;
                case 2:
                    System.out.println("2.signin feature");
                    break;

                case 3:
                    System.out.println("3.Exit feature");
                    Exit = true;
                    break;

                default:
                    System.out.println("Invalid");
                    counter++;

            }

            if (Exit) {
                System.out.println("vaild success");
            }

            if (counter == 4) {
                System.out.println("Turn to Admin");
                break;
            }


        }

    }
}


