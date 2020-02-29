package com.kyleanderson;

import static org.junit.Assert.*;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() {
        BankAccount account = new BankAccount("Kyle", "Anderson", 1000.00);
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);

    }

    @org.junit.Test
    public void withdraw() {
        fail("This test is yet to be implemented");

    }

    @org.junit.Test
    public void getBalance_deposit() {
        BankAccount account = new BankAccount("Kyle", "Anderson", 1000.00);
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);

    }

    @org.junit.Test
    public void getBalance_withdraw() {
        BankAccount account = new BankAccount("Kyle", "Anderson", 1000.00);
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);

    }

}

