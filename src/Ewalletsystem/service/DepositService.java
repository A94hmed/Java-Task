package Ewalletsystem.service;

import Ewalletsystem.model.Account;

public interface DepositService {
    boolean deposit(Account account, double amount);
}
