package com.kyleanderson;

public class BankAccount {

    private double balance;
    private String accountNumber;

    public BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("The new balance after deposit is " + balance);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("The new balance after withdrawal is " + balance);
    }
}
