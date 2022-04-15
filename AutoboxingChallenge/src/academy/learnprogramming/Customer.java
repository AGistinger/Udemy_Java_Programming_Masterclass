package academy.learnprogramming;

import java.util.ArrayList;

public class Customer {
    // Private variables
    private String name;
    private ArrayList<Double> transactions = new ArrayList<>();

    // Constructor
    public Customer(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    /**
     * Adds a transaction to the customer and return the customer object.
     * @param transaction
     * @return Customer
     */
    public Customer addTransaction(double transaction) {
        this.transactions.add(transaction);
        System.out.println("Added Transaction for " + transaction + " For " + this.getName());
        return this;
    }

    /**
     * Displays all the customers transactions in the console.
     */
    public void printTransactions() {
        System.out.println("Customer: " + this.getName() + "\nTransactions:");
        int count = 1;
        for(double transaction : this.transactions) {
            System.out.println(count + ". " + transaction);
            count++;
        }
    }
}
