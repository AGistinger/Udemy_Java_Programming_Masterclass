package com.junit_testing;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;
    private int accountType;

    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;

    public BankAccount(String firstName, String lastName, double balance, int accountType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isChecking() {
        return accountType == CHECKING;
    }

    // The branch argument is true if the customer is performing the transaction
    // at a branch, with the teller.
    // It's false if the customer is performing the transaction at an ATM.
    public double deposit(double amount, boolean branch) {
        balance += amount;
        return balance;
    }

    // The branch argument is true if the customer is performing the transaction
    // at a branch, with the teller.
    // It's false if the customer is performing the transaction at an ATM.
    public double withdraw(double amount, boolean branch) {
        if((amount > 500.00) && !branch) {
            throw new IllegalArgumentException();
        }
        balance -= amount;
        return balance;
    }

    // More methods that use firstName, lastName, and preform other functions.
}
