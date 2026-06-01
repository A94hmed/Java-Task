package Ewalletsystem.service;

import Ewalletsystem.model.Account;

public interface AccountService {
     boolean CreateAccount(Account account);
     boolean IsAccountExistByUserNameandPassword(Account account);

}
