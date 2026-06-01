package Ewalletsystem.model;

import java.util.ArrayList;
import java.util.List;

public class Ewallet {
    private final String name="Eraa wallet" ;
    List<Account> account=new ArrayList<>();

    public String getName() {
        return name;
    }

    public List<Account> getAccount() {
        return account;
    }

    public void setAcounts(List<Account> acounts) {
        this.account = acounts;
    }
}
