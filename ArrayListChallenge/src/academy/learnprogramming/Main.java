package academy.learnprogramming;

import java.util.Scanner;

/**
 * Array List Challenge
 * Create a program that implements a simple mobile phone with the following capabilities.
 * Able to store, modifiy and remove a query contact names.
 * You will want to create a separate class for Contacts (name and phone number).
 * Create a master class (MobilePhone) that holds the ArrayList of Contacts.
 * The MobilePhone class has the functionality listed below.
 * Add a menu of options that are available.
 * Options: Quit, print list of contacts, add new contact, update existing contact, remove contact
 * and search/find contact.
 * When adding or updating be sure to check if the contact already exists (use name).
 * Be sure not to expose the inner workings of the ArrayList to MobilePhone.
 * e.g. no ints, no .get(i) etc.
 * MobilePhone should do everything with Contact objects only.
 */

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone phone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        phone.printMenu();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    phone.printMenu();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;
            }
        }
    }
}
