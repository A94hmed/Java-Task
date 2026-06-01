package Ewalletsystem.Validation;

import Ewalletsystem.Exception.InvalidWithdraw;

public class ValidWithdrawService {

    public boolean CheckWithdraw(double amount)
            throws InvalidWithdraw {

        if (amount <= 0) {

            throw new InvalidWithdraw(
                    "Withdraw amount must be greater than 0"
            );
        }

        return false;
    }
}
