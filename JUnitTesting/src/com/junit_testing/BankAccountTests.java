package com.junit_testing;

import static junit.framework.TestCase.*;

public class BankAccountTests {
    private BankAccount account;
    private static int count;

    @org.junit.BeforeClass // will run before any tests run
    public static void beforeClass() {
        System.out.println("This executes before any test cases. Count = " + count++);
    }

    @org.junit.Before // will run before each test runs
    public void setup() {
        account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @org.junit.Test
    public void getBalance_deposit() throws Exception {
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() throws Exception {
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void deposit() throws Exception {
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0); // allows leeway in values
    }

    @org.junit.Test
    public void withdraw_atBranch() throws Exception {
        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() throws Exception {
        account.withdraw(600.00, false);
        fail("Should have thrown an IllegalArgumentException");
    }

    @org.junit.Test // pre-jUnit 4 exception test
    public void withdraw_notBranch2() throws Exception {
        try {
            account.withdraw(600.00, false);
            fail("Should have thrown an IllegalArgumentException");
        } catch(IllegalArgumentException err) {

        }
    }

    @org.junit.Test
    public void isChecking_true() throws Exception {
        assertTrue("The account is NOT checking account", account.isChecking());
    }

    @org.junit.After // will run after each individual test
    public void teardown() {
        System.out.println("Count = " + count++);
    }

    @org.junit.AfterClass // will run after all tests finish
    public static void afterClass() {
        System.out.println("This executes after any test cases.  Count = " + count++);
    }
}