package academy.learnprogramming;

import java.util.ArrayList;

public class MobilePhone {
    // variables
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    // Private Functions


    // Public Functions
    public void printMenu() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To show choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add new contact.");
        System.out.println("\t 3 - To update existing contact");
        System.out.println("\t 4 - To remove contact");
        System.out.println("\t 5 - To search for contact");
        System.out.println("\t 6 - To quit the application");
    }

    public Contact findContact(String name) {
        for(Contact contact : contacts) {
            if(contact.getName().equals(name)) {
                return contact;
            }
        }
        System.out.println(name + " not found in contacts.");
        return null;
    }
}
