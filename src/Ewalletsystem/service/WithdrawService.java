package Ewalletsystem.service;

import Ewalletsystem.Exception.InvalidWithdraw;
import Ewalletsystem.model.Account;

public interface WithdrawService {


    boolean withdraw(Account account, double amount) throws InvalidWithdraw;




}
