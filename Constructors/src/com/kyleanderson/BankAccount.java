package com.kyleanderson;

public class BankAccount {

    // Fields
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    //Methods

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double depositFunds(double depositAmount) {
        this.balance = this.balance + depositAmount;
        System.out.println("Your new balance is: " + this.balance);
        return this.balance;
    }

    public double withdrawFunds(double withdrawAmount) {
        if(withdrawAmount > this.balance) {
            System.out.println( "Sorry, but you're a broke-ass fuck.");
            return this.balance;
        } else {
            this.balance = this.balance + withdrawAmount;
            System.out.println("Your new balance is: " + this.balance);
            return this.balance;
        }
    }

}
