package Ewalletsystem.model;

public class Accounts {
   private String username;
   private String password;
   private double balance;
   private String phone;
   private int age;

    public Accounts(String username, String password, double balance, String phone, int age) {
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.phone = phone;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public double getBalance() {
        return balance;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }
}
