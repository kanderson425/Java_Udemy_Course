package com.kyleanderson;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
        private double balance;
        private String accountNumber;
        private Lock lock = new ReentrantLock();

        BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public boolean withdraw(double amount) {
            if (lock.tryLock()) {
                try {
                    try {
                        // Simulate database access
                        Thread.sleep(100);
                    }
                    catch (InterruptedException e) {
                    }
                    balance -= amount;
                    System.out.printf("%s: Withdrew %f\n", Thread.currentThread().getName(), amount);
                    return true;
                } finally {
                    lock.unlock();
                }
            }
            return false;
        }

        public boolean deposit(double amount) {
            if (lock.tryLock()) {
                try {
                    try {
                        // Simulate database access
                        Thread.sleep(100);

                    }
                    catch (InterruptedException e) {
                    }
                    balance += amount;
                    System.out.printf("%s: Deposited %f\n", Thread.currentThread().getName(), amount);
                    return true;
                } finally {
                    lock.unlock();
                }
            }
            return false;
        }

        public boolean transfer(com.kyleanderson.BankAccount destinationAccount, double amount) {
            if (withdraw(amount)) {
                if (destinationAccount.deposit(amount)) {
                    return true;
                }
                else {
                    // The deposit failed. Refund the money back into the account.
                    System.out.printf("%s: Destination account busy. Refunding money\n",
                            Thread.currentThread().getName());
                    deposit(amount);
                }
            }

            return false;
        }
    }

    class Transfer implements Runnable {
        private com.kyleanderson.BankAccount sourceAccount, destinationAccount;
        private double amount;

        Transfer(com.kyleanderson.BankAccount sourceAccount, com.kyleanderson.BankAccount destinationAccount, double amount) {
            this.sourceAccount = sourceAccount;
            this.destinationAccount = destinationAccount;
            this.amount = amount;
        }

        public void run() {
            while (!sourceAccount.transfer(destinationAccount, amount))
                continue;
            System.out.printf("%s completed\n", Thread.currentThread().getName());
        }

    }
