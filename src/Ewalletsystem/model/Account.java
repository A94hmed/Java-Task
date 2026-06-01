package Ewalletsystem.model;

public class Account {
   private String userName;
   private String password;
   private double balance;
   private int phone;
   private int age;

    public void setBalance(double balance) {
        this.balance = balance;
    }
//constructor signup

    public Account(String userName, String password, int phone, int age) {
        this.userName = userName;
        this.password = password;
        this.balance = 0.0;
        this.phone = phone;
        this.age = age;
    }

    //constructor signin

    public Account(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Account(String userName, String password, int phonenumber, float age) {
    }

    public String getUsername() {
        return userName;
    }

    public double getBalance() {
        return balance;
    }

    public int getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }
}
