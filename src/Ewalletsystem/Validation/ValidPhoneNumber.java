package Ewalletsystem.Validation;

import Ewalletsystem.Exception.InvalidPhoneNumber;

public class ValidPhoneNumber {

    public void CheckPhoneNumber(int phone) throws InvalidPhoneNumber {
        if (String.valueOf(phone).length() != 11) {

            throw new InvalidPhoneNumber("Phone number must be 11 digits");
        }

        System.out.println("Valid Phone Number");
    }

}
