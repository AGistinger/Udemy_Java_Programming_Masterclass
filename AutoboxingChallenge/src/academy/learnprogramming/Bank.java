package academy.learnprogramming;

import java.util.ArrayList;

public class Bank {
    // private variables
    private ArrayList<Branch> branches = new ArrayList<>();

    /**
     * Takes the name of the branch
     * and returns the index of the branch if found
     * returns -1 if not found
     * @param name
     * @return int
     */
    private int findBranch(String name) {
        for(Branch branch : this.branches) {
            if(branch.getBranchName().equals(name)) {
                return this.branches.indexOf(branch);
            }
        }
        return -1;
    }

    /**
     * Uses find branch to
     * determine if the branch exists, returns a boolean value
     * @param branch
     * @return boolean
     */
    private boolean branchExists(String branch) {
        return findBranch(branch) >= 0;
    }

    /**
     * Accepts a branch name and then checks if
     * that branch already exists in the branches array list.  If
     * the branch already exists the branch will not be added and return false.
     * If the branch does not already exists it will be added and return true.
     * @param branch
     * @return boolean
     */
    public boolean addBranch(String branch) {
        if(branchExists(branch)) {
            System.out.println("Unable to add " + branch + ", already exists");
            return false;
        }
        this.branches.add(new Branch(branch));
        return true;
    }

    /**
     * Takes the name of a branch and customer name, and amount.  There will be a check
     * if the branch already exists and if the branch exists the new customer will be
     * added and return true.  If the branch does not exist the customer will not be added and return false.
     * @param branch
     * @param customer
     * @param amount
     * @return boolean
     */
    public boolean addCustomerToBranch(String branch, String customer, double amount) {
        if(branchExists(branch)) {
            return this.branches.get(findBranch(branch)).addCustomer(customer, amount);
        }
        System.out.println("Branch: " + branch + " not found");
        return false;
    }

    /**
     * Takes the name of a branch, customer name and the transaction amount.
     * There will be a check to see if the branch exists and if the branch exists the transaction
     * will be added to the customer and return true. If the branch does not exist the transaction
     * will not be added and return false.
     * @param branch
     * @param customer
     * @param transaction
     * @return
     */
    public boolean addTransactionForCustomer(String branch, String customer, double transaction) {
        if(branchExists(branch)) {
            if(this.branches.get(findBranch(branch)).addTransaction(customer, transaction)) {
                System.out.println(transaction + " added to " + customer);
                return true;
            }
        }
        System.out.println("Unable to add transaction to " + customer + ", customer does not exist");
        return false;
    }

    /**
     * Prints information from the branches to the console
     */
    public void printBranches() {
        for(Branch branch : this.branches) {
            System.out.println("Branch: " + branch.getBranchName());
            branch.printCustomers();
        }
    }
}
