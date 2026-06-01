package Ewalletsystem.Validation;

import Ewalletsystem.Exception.InvalidAmount;

public class ValidAmount {

    public void CheckAmount(double amount) throws InvalidAmount{
        if (amount<=0){
            throw  new InvalidAmount("Amount Must Be Greater Than Zero");
        }
    }
}
