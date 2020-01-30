package com.kyleanderson;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private double balance;
    private String accountNumber;

    private Lock lock;


    public BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.lock = new ReentrantLock();
    }

    //Uses a lock based on a ReentrantLock object
//    public void deposit(double amount) {
//        lock.lock();
//        try {
//            balance += amount;
//            System.out.println("The new balance after deposit is " + balance);
//        } finally {
//            lock.unlock();
//        }
//    }
//
//    public void withdraw(double amount) {
//        lock.lock();
//        try {
//            balance -= amount;
//            System.out.println("The new balance after withdrawal is " + balance);
//        } finally {
//            lock.unlock();
//        }
//    }

    //Uses tryLock with a timeout
    public void deposit(double amount) {

        boolean status = false;

        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    balance += amount;
                    status = true;
                    System.out.println("The new balance after deposit is " + balance);

                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Could not get the lock");
            }
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Transaction status = " + status);

    }

    public void withdraw(double amount) {

        boolean status = false;

        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    balance -= amount;
                    status = true;
                    System.out.println("The new balance after withdrawal is " + balance);
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Could not get the lock");
            }
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Transaction status = " + status);
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void printAccountNumber() {
        System.out.println("Account Number = " + accountNumber);


    }
}
