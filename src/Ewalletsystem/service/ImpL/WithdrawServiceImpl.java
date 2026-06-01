package Ewalletsystem.service.ImpL;

import Ewalletsystem.Exception.InvalidWithdraw;
import Ewalletsystem.model.Account;
import Ewalletsystem.service.WithdrawService;


public  class WithdrawServiceImpl implements WithdrawService {


    @Override
    public boolean withdraw(Account account, double amount) throws InvalidWithdraw {


        if (amount <= 0) {
            throw new InvalidWithdraw(
                    "Withdraw amount must be greater than 0"
            );
        }

        if (account.getBalance() < amount) {
            throw new InvalidWithdraw(
                    "Insufficient Balance"
            );
        }

        double newBalance = account.getBalance() - amount;

        account.setBalance(newBalance);



        return true;
    }






}
