package Ewalletsystem.Validation;

import Ewalletsystem.Exception.InvalidTransfer;

public class validTransfer {
    public static void CheckTransfer(double amount) throws InvalidTransfer {
        if(amount<=0){
            throw  new InvalidTransfer("Transfer amount must be greater than 0");

        }

    }
}
