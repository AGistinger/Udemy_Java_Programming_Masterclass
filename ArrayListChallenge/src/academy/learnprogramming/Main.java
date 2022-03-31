package academy.learnprogramming;

import java.util.Scanner;

/**
 * Array List Challenge
 * Create a program that implements a simple mobile phone with the following capabilities.
 * Able to store, modify and remove a query contact names.
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

    /**
     * Instructors solution variables
     * private static Scanner scanner = new Scanner(System.in);
     * private static MobilePhone mobilePhone = new MobilePHone("0039 330 4404");
     */

    private static final Scanner scanner = new Scanner(System.in);
    private static final MobilePhone phone = new MobilePhone("810-499-6435");

    public static void main(String[] args) {
        boolean quit = false;
        int choice;
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
                    phone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

        /**
         * Instructors main method code solution
         * boolean quit = false;
         * startPhone();
         * printActions();
         * while(!quit) {
         *   System.out.println("\nEnter an action: (6 to show available actions)");
         *   int action = scanner.nextInt();
         *   scanner.nextLine();
         *
         *   switch(action) {
         *      case 0:
         *          System.out.println("\nShutting down...");
         *          quit = true;
         *          break;
         *      case 1:
         *          mobilePhone.printContacts();
         *          break;
         *      case 2:
         *          addNewContact();
         *          break;
         *      case 3:
         *          updateContact();
         *          break;
         *      case 4:
         *          removeContact();
         *          break;
         *      case 5:
         *          queryContact();
         *          break;
         *      case 6:
         *          printActions();
         *          break;
         *  }
         * }
         */
    }

    // Functions
    public static void addContact() {
        System.out.println("Enter a name for the contact:");
        String name = scanner.nextLine();
        System.out.println("Enter a phone number for the contact:");
        String phoneNumber = scanner.nextLine();

        phone.addContact(name, phoneNumber);
    }

    public static void modifyContact() {
        System.out.println("Enter a name for the contact you want to modify:");
        String searchName = scanner.nextLine();
        System.out.println("Enter a new name for the contact:");
        String newName = scanner.nextLine();
        System.out.println("Enter a new phone number for the contact:");
        String newNumber = scanner.nextLine();

        if(phone.queryContact(newName)) {
            System.out.println("Contact with name " + newName + " already exists.  Update not successful");
        } else {
            phone.modifyContact(searchName, newName, newNumber);
        }
    }

    public static void removeContact() {
        System.out.println("Enter the name of the contact you want to remove:");
        String searchName = scanner.nextLine();

        phone.removeContact(searchName);
    }

    public static void searchContact() {
        System.out.println("Enter the name of the contact you want to search for:");
        String searchName = scanner.nextLine();

        phone.searchContacts(searchName);
    }

    /**
     * Instructures Function solutions
     * private static void startPhone() {
     *     System.out.println("Starting phone...");
     * }
     *
     * private static void addNewContact() {
     *      System.out.println("Enter new contact name: ");
     *      String name = scanner.nextLine();
     *      System.out.println("Enter phone number: ");
     *      String phone = scanner.nextLine();
     *      Contact newContact = Contact.createContact(name, phone);
     *      if(mobilePhone.addNewContact(newContact)) {
     *          System.out.println("New contact added: name = " + name + ", phone = " + phone);
     *      } else {
     *          System.out.println("Cannot add, " + name + " already on file");
     *      }
     * }
     *
     * private static void updateContact() {
     *     System.out.println("Enter existing contact name: ");
     *     String name = scanner.nextLine();
     *     Contact existingContactRecord = mobilePhone.queryContact(name);
     *     if(existingContactRecord == null) {
     *         System.out.println("Contact not found.");
     *         return;
     *     }
     *
     *     private static void removeContact() {
     *         System.out.println("Enter existing contact name: ");
     *         String name = scanner.nextLine();
     *         Contact existingContactRecord = mobilePhone.queryContact(name);
     *         if(existingContactRecord == null) {
     *             System.out.println("Contact not found.);
     *             return;
     *         }
     *
     *         if(mobilePhone.remove(existingContactRecord)) {
     *             System.out.println("Successfully deleted");
     *         } else {
     *             System.out.println("Error deleting contact");
     *         }
     *     }
     *
     *     private static void queryContact() {
     *         System.out.println("Enter existing contact name: ");
     *         String name = scanner.nextLine();
     *         Contact existingContactRecord = mobilePhone.queryContact(name);
     *         if(existingContactRecord == null) {
     *             System.out.println("Contact not found.);
     *             return;
     *         }
     *
     *         System.out.println("Name: " + existingContactRecord.getName() +
     *              "phone number is " + existingContactRecord.getPhoneNumber());
     *     }
     *
     *     System.out.print("Enter new contact name: ");
     *     String newName = scanner.nextLine();
     *     System.out.print("Enter new contact phone number: ");
     *     String newNumber = scanner.nextLine();
     *     Contact newContact = Contact.createContact(newName, newNumber);
     *     if(mobilePhone.updateContact(existingContactRecord, newContact)) {
     *         System.out.println("Successfully updated record");
     *     } else {
     *         System.out.println("Error updating record");
     *     }
     * }
     *
     * private static void printActions() {
     *     System.out.println("\nAvailable acttions:\npress:");
     *     System.out.println("0 - to shutdown\n" +
     *                        "1 - to print contacts\n" +
     *                        "2 - to add a new contact\n" +
     *                        "3 - to update an existing contact\n" +
     *                        "4 - to remove an existing contact\n" +
     *                        "5 - query if an existing contact exists\n" +
     *                        "6 - to print a list of available actions.");
     *     System.out.println("Choose yoru action:  ");
     * }
     */
}
