package Ewalletsystem.Validation;
import Ewalletsystem.Exception.InvalidUserName ;
public class ValidUserName {

    public void CheckUserName(String name) throws InvalidUserName{

        if (name == null || name.trim().isEmpty()) {
            throw new InvalidUserName("Username cannot be empty");
        }

        if(name.length()<3){
            throw new InvalidUserName("Username must be at least 3 characters");
        }

        System.out.println("Valid Username");

    }
}
