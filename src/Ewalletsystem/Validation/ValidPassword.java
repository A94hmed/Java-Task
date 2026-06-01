package Ewalletsystem.Validation;

import Ewalletsystem.Exception.InvaildPassword;

public class ValidPassword {

    public boolean CheckPassword (String password) throws InvaildPassword {
        if (password == null || password.trim().isEmpty()) {
            throw new InvaildPassword("Password cannot be empty");

        }

        if (password.length() < 8) {
            throw new InvaildPassword("Password must be at least 8 characters");

        }
        return false;
    }



}
