package Ewalletsystem.service.ImpL;

import Ewalletsystem.model.Account;
import Ewalletsystem.model.Ewallet;
import Ewalletsystem.service.AccountService;

public class AccountServiceImpL implements AccountService {

    private Ewallet ewallet = new Ewallet();

    @Override
    public boolean CreateAccount(Account account) {
        //unique username
        boolean isAccountExist = ewallet.getAccount().stream().anyMatch(acc -> acc.getUsername().equals(account.getUsername()));

        if (isAccountExist) {
            return false;
        }


        ewallet.getAccount().add(account);
        return true;
    }



    //unique username and password

    @Override
    public boolean IsAccountExistByUserNameandPassword(Account account) {
        boolean IsAccountExist = ewallet.getAccount().stream().anyMatch(acc -> acc.getUsername().equals(account.getUsername()) && acc.getPassword().equals(account.getPassword()));

        if (IsAccountExist) {
            return true;
        } else {
            return false;
        }

    }


}
