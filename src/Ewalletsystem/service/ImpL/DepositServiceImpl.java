package Ewalletsystem.service.ImpL;

import Ewalletsystem.model.Account;
import Ewalletsystem.service.DepositService;

public class DepositServiceImpl implements DepositService {


    @Override
    public boolean deposit(Account account, double amount) {

        if(amount<=0){
            System.out.println("Invalid amount");
            return false;
        }

        double currentbalance= account.getBalance();

        currentbalance=currentbalance+amount;
        account.setBalance(currentbalance);


        return true;
    }
}
