package academy.learnprogramming;

import java.util.ArrayList;

public class Branch {
    // Private variables
    private ArrayList<Customer> customers = new ArrayList<>();
    private String branchName;

    // Constructor for branch
    public Branch(String name) {
        this.branchName = name;
    }

    // Getter
    public String getBranchName() {
        return this.branchName;
    }

    /**
     * Takes the name of a customer and return the index of that customer
     * in the customers array list if it exists.  If the customer does not exist will return -1.
     * @param name
     * @return int
     */
    private int findCustomer(String name) {
        for(Customer customer : this.customers) {
            if(customer.getName().equals(name)) {
                return this.customers.indexOf(customer);
            }
        }
        return -1;
    }

    private int findCustomer(Customer customer) {
        return findCustomer(customer.getName());
    }

    /**
     * Returns a boolean to check if the customer exists in the customers array list.
     * @param name
     * @return boolean
     */
    private boolean customerExists(String name) {
        return findCustomer(name) >= 0;
    }

    /**
     * Takes the name of a customer and the amount, then check if the customer already exists.
     * If the customer exists the customer will not be added and return false.
     * If the customer does not already exist the new customer will be added
     * and return true.
     * @param name
     * @param amount
     * @return
     */
    public boolean addCustomer(String name, double amount) {
        if(customerExists(name)) {
            System.out.println("Unable to add " + name + ", customer already exists");
            return false;
        }
        this.customers.add(new Customer(name).addTransaction(amount));
        return true;
    }

    /**
     * Accepts a customer name and amount and then checks if the customer already exists.
     * If the customer exists the new transaction is added and returns true.
     * If the customer does not exist the transaction is not added and returns false.
     * @param customer
     * @param amount
     * @return boolean
     */
    public boolean addTransaction(String customer, double amount) {
        if(customerExists(customer)) {
            this.customers.get(findCustomer(customer)).addTransaction(amount);
            return true;
        }
        System.out.println("Unable to add transaction, " + customer + " does not exist");
        return false;
    }

    /**
     * Prints information from the customers to the console.
     */
    public void printCustomers() {
        for(Customer customer : this.customers) {
            customer.printTransactions();
        }
    }
}
