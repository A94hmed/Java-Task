package Ewalletsystem.service.ImpL;

import Ewalletsystem.Exception.*;
import Ewalletsystem.Validation.*;
import Ewalletsystem.model.Account;
import Ewalletsystem.service.*;
import Ewalletsystem.service.ImpL.TransferServiceImpl;

import java.util.Scanner;

public class ApplicationServicesImpl implements ApplicationServices {
    private final Scanner scanner = new Scanner(System.in);

    private AccountService accountService = new AccountServiceImpL();
    private DepositService depositService = new DepositServiceImpl();
    private TransferService transferService = new TransferServiceImpl();
    private LogoutService logoutService = new LogoutServiceImpl();

    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        boolean Exit = false;


        while (true) {
            System.out.println("Hello");
            System.out.println("what do you need");
            System.out.println("1.signin  2.signup 3.exit");

            int choose = scanner.nextInt();


            switch (choose) {
                case 1:
                    try {
                        Signin();
                    } catch (InvalidUserName e) {
                        System.out.println(e.getMessage());
                    } catch (InvaildPassword e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:

                    try {
                        signup();
                    } catch (InvalidUserName e) {
                        System.out.println(e.getMessage());
                    } catch (InvaildPassword e) {
                        System.out.println(e.getMessage());
                    } catch (InvalidPhoneNumber e) {
                        System.out.println(e.getMessage());
                    }

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

    private void signup() throws InvalidUserName, InvaildPassword, InvalidPhoneNumber {

        int success = 0;

        while (success < 4) {


            System.out.println("pls enter username");
            String name = scanner.next();

            ValidUserName validUserName = new ValidUserName();
            validUserName.CheckUserName(name);

            System.out.println("pls enter password");
            String password = scanner.next();

            ValidPassword validPassword = new ValidPassword();
            validPassword.CheckPassword(password);

            System.out.println("pls enter phone number");
            int phoneNumber = scanner.nextInt();

            try{
                ValidPhoneNumber validPhoneNumber = new ValidPhoneNumber();
                validPhoneNumber.CheckPhoneNumber(phoneNumber);
            }catch (InvalidPhoneNumber e){
                System.out.println("Error: "+e.getMessage());
                return;
            }


            System.out.println("pls enter age");
            int age = scanner.nextInt();

            Account account = new Account(name, password, phoneNumber, age);

            boolean isAccountExist = accountService.CreateAccount(account);

            if (isAccountExist) {
                System.out.println("Account is Success");
            } else {
                System.out.println("Account is faild");
            }

            success++;
        }

    }
    //signin

    private void Signin() throws InvalidUserName, InvaildPassword {
        int valid = 0;

        while (valid < 4) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("pls enter username");
            String name = scanner.next();
            ValidUserName validUserName = new ValidUserName();
            validUserName.CheckUserName(name);

            System.out.println("pls enter password");
            String password = scanner.next();
            ValidPassword validPassword = new ValidPassword();
            validPassword.CheckPassword(password);


            Account account = new Account(name, password);

            boolean IsAccountUsernameandpasswordExist = accountService.IsAccountExistByUserNameandPassword(account);
            if (IsAccountUsernameandpasswordExist) {
                mainProfile(account);

            } else {
                System.out.println("Invalid UserName or Password");
            }
            valid++;
        }


    }

    private void mainProfile(Account account) {


        while (true) {
            System.out.println("\n========== MAIN PROFILE ==========");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("3. Logout");
            System.out.print("Choose option: ");




            int choose = scanner.nextInt();

            switch (choose) {

                case 1:

                    deposit(account);
                    break;

                case 2:
                    withdraw();
                    System.out.println("Withdraw Coming Soon");
                    break;

                case 3:
                    //Transfer
                    transfer();
                    System.out.println("Transfer Success");
                    break;
                case 4:

                   //logout
                    logout();
                    System.out.println("Logout Success");

                    return;





            }
        }
    }

    private void deposit(Account account) {

        System.out.println("Enter username:");
        String username = scanner.next();

        System.out.println("Enter amount:");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid amount");
            return ;
        }


        boolean success = depositService.deposit(account, amount);
        if (success) {
            System.out.println("Deposit Success");
        }


    }

    public void withdraw(){

        try {

            System.out.println("Enter username:");
            String username = scanner.next();

            System.out.println("Enter amount:");
            double amount = scanner.nextDouble();

            ValidWithdrawService validWithdrawService = new ValidWithdrawService();

            validWithdrawService.CheckWithdraw(amount);

            Account account = new Account(username, "");

            boolean success = validWithdrawService.CheckWithdraw(amount);

            if (success) {

                System.out.println("Withdraw Success");

            }

        } catch (InvalidWithdraw e) {

            System.out.println(e.getMessage());

        }

    }

    public void transfer(){

            try {

                System.out.println("Enter sender username:");
                String senderName = scanner.next();

                System.out.println("Enter receiver username:");
                String receiverName = scanner.next();

                System.out.println("Enter amount:");
                double amount = scanner.nextDouble();

                validTransfer validtransfer = new validTransfer();

                validTransfer.CheckTransfer(amount);

                Account sender =
                        new Account(senderName, "");

                Account receiver =
                        new Account(receiverName, "");

                boolean success =
                        transferService.transfer(
                                sender,
                                receiver,
                                amount
                        );

                if (success) {

                    System.out.println(
                            "Transfer Success"
                    );
                }

            } catch (InvalidTransfer e) {

                System.out.println(e.getMessage());
            }


    }


    public void logout() {
        boolean success = logoutService.logout();

        if (success) {

            System.out.println("Logout Success");
        }
    }
}










