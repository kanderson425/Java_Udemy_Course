package com.kyleanderson;

public class BankAccount {

    private double balance;
    private String accountNumber;

    public BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        synchronized (this) {
            balance += amount;
            System.out.println("The new balance after deposit is " + balance);
        }
    }

    public void withdraw(double amount) {
        synchronized (this) {
            balance -= amount;
            System.out.println("The new balance after withdrawal is " + balance);
        }
    }

    public String getAccountNumber() {
            return accountNumber;

    }

    public void printAccountNumber() {
            System.out.println("Account Number = " + accountNumber);

    }
}
