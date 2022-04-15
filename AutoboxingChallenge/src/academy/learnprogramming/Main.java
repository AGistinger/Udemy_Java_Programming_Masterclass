package academy.learnprogramming;

import java.util.Scanner;

/**
 * Your job is to create a simple banking application.
 * There should be a Bank class.
 * It should have an arrayList of Branches.
 * Each Branch should have an arrayList of Customers.
 * The Customer class should have an arrayList of Doubles (transactions)
 * Customer:
 * Name, and the ArrayList of doubles.
 * Branch:
 * Need to be able to add new customer and initial transaction amount.
 * Also needs to add additional transactions for that customer/branch.
 * Bank:
 * Add a new branch
 * Add a customer to that branch with initial transaction amount.
 * Add a transaction for the existing customer for that branch.
 * Show a list of customers for a particular branch and optionally a list
 * of their transactions.
 * Demonstration of autoboxing and unboxing in your code.
 * Hint: Transactions
 * Add data validation
 * e.g. check if exists, or does not exist, etc.
 * Think about where you are adding the code to perform certain actions.
 */

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank();

    public static void main(String[] args) {
        printOptions();
        runBank();
    }

    /**
     * Prints the options of the appllication to the console
     */
    public static void printOptions() {
        System.out.println("Menu:");
        System.out.println("0 - View options");
        System.out.println("1 - Add a branch");
        System.out.println("2 - Add a customer");
        System.out.println("3 - Add transaction for a customer");
        System.out.println("4 - View bank records");
        System.out.println("5 - Quit");
    }

    /**
     * Runs the application in a while loop until the user selects a non-valid key
     */
    public static void runBank() {
        boolean running = true;

        while(running) {
//            System.out.println("Enter choice:");
//            int choice = scanner.nextInt();
//            scanner.nextLine();
            int choice = getChoice();

            switch(choice) {
                case 0: printOptions();
                    break;
                case 1 : addBranch();
                    break;
                case 2 : addCustomer();
                    break;
                case 3: addTransaction();
                    break;
                case 4 : bank.printBranches();
                    break;
                default:
                    System.out.println("Quitting application");
                    running = false;
                    break;
            }
        }
    }

    /**
     * Asks the user to enter the name of a branch and then attempts to add the branch
     */
    public static void addBranch() {
        System.out.println("Enter the name of the branch:");
        String branchName = scanner.next();

        if(bank.addBranch(branchName)) {
            System.out.println("New branch " + branchName + " added");
        }
    }

    /**
     * Asks the user to enter information for a customer they want to add and then
     * attempts to add the customer
     */
    public static void addCustomer() {
        System.out.println("Enter the name of the branch you want to add a customer for:");
        String branchName = scanner.nextLine();

        System.out.println("Enter the name of the customer you want to add:");
        String customerName = scanner.nextLine();

        System.out.println("Enter the initial amount you want to add for the new customer:");
        double amount = getTransactionAmount();

        if(bank.addCustomerToBranch(branchName, customerName, amount)) {
            System.out.println(customerName + "  added " + " for " + amount + " at branch " + branchName);
        }
    }

    /**
     * Asks the user to enter information for a customer they want to add a transaction for
     * then attempts to add that transaction
     */
    public static void addTransaction() {
        System.out.println("Enter the name of the branch you want to add the transaction for:");
        String branchName = scanner.nextLine();

        System.out.println("Enter the name of the customer you want to add a transaction for:");
        String customerName = scanner.nextLine();

        System.out.println("Enter the transaction amount you want to add for " + customerName + ":");
        double amount = getTransactionAmount();

        if(bank.addTransactionForCustomer(branchName, customerName, amount)) {
            System.out.println("Transaction added for " + customerName + " for " + amount + " at branch " + branchName);
        }
    }

    /**
     * Will return the int the user selects, if the user does not enter a valid
     * int, will return -1 to exit application
     * @return int
     */
    public static int getChoice() {
        System.out.println("Enter choice:");

        if(scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            return choice;
        }
        return -1;
    }

    /**
     * Check if value entered is a double and returns double,
     * asks user to re-enter an amount if the amount is not a number
     */
    public static double getTransactionAmount() {
        while(!scanner.hasNextDouble()) {
            System.out.println("Amount entered is not a number, try again:");
            scanner.nextLine();
        }

        double amount = scanner.nextDouble();
        scanner.nextLine();
        return amount;
    }
}
