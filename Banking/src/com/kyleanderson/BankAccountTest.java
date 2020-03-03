package com.kyleanderson;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;

    @org.junit.BeforeClass
    public static void beforeClass() {
        System.out.println("This executes before any test cases.");
    }

    @org.junit.Before
    public void setup() {
        BankAccount account = new BankAccount("Kyle", "Anderson", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @org.junit.Test
    public void deposit() {
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);

    }

    @org.junit.Test
    public void withdraw() {
        fail("This test is yet to be implemented");

    }

    @org.junit.Test
    public void getBalance_deposit() { account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);

    }

    @org.junit.Test
    public void getBalance_withdraw() {
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true() {
        assertTrue("The account is NOT a checking account", account.isChecking());

    }

    @org.junit.AfterClass
    public static void afterClass() {
        System.out.println("This executes after any test cases");
    }

}
