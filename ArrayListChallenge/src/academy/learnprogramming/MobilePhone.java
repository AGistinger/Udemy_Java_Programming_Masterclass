package academy.learnprogramming;

import java.util.ArrayList;

public class MobilePhone {
    // variables
    private final String myNumber;
    private final ArrayList<Contact> myContacts;

    // Constructor
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    // Private Functions
    /**
     * Instructors findContact solution
     * private int findContact(Contact contact) {
     *     return this.myContacts.indexOf(contact);
     * }
     *
     * private int findContact(String contactName) {
     *     for(int i=0; i < this.myContacts.size(); i++ {
     *     Contact contact = this.myContacts.get(i);
     *     if(contact.getName().equals(contactName)) {
     *         return i;
     *     }
     *     return -1;
     * }
     */
    private int findContact(String name) {
        for(Contact contact : myContacts) {
            if(contact.getName().equals(name)) {
                return myContacts.indexOf(contact);
            }
        }
        System.out.println(name + " not found in contacts.");
        return -1;
    }

    private void modifyContact(int position, Contact contact) {
        myContacts.set(position, contact);
    }

    private void removeContact(int position) {
//        Contact contact = myContacts.get(position);
        myContacts.remove(position);
    }

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

    public void searchContacts(String name) {
        if(findContact(name) != -1) {
            System.out.println("Contact information for " + name + " found.");
        }
    }

    /**
     * Instructors printContacts solution
     * public void printContacts() {
     *     System.out.println("Contact List:");
     *     for(int i=0; i < this.myContacts.size(); i++) {
     *         System.out.println((i+1) + ". " + this.myContacts.get(i).getName() +
     *          " -> " + this.myContacts.get(i).getPhoneNumber());
     *     }
     * }
     */

    public void printContacts() {
        System.out.println("Contacts List:");
        for(Contact contact : myContacts) {
            System.out.println("Name: " + contact.getName() + " Phone: " + contact.getPhoneNumber());
        }
    }

    /**
     * Instructors add contact solution
     * public boolean addNewContact(Contact contact) {
     *     if(findContact(contact.getName()) >= 0) {
     *         System.out.println("Contact is already on file");
     *         return false;
     *     }
     *     myContacts.add(contact);
     *     return true;
     * }
     */

    public void addContact(String name, String phoneNumber) {
        myContacts.add(new Contact(name, phoneNumber));
        System.out.println("Contact: " + name + " Number: " + phoneNumber + ", Has been added");
    }

    /**
     * Instructors modifyContact solution
     * public boolean updateContact(Contact oldContact, Contact newContact) {
     *     int foundPosition = findContact(oldContact);
     *     if(foundPosition < 0) {
     *         System.out.println(oldContact.getName() + " was not found.");
     *         return false;
     *     } else if(findContact(newContact.getName()) != -1)  {
     *         System.out.println("Contact with name " + newContact.getName() +
     *              " already exists. Update was not successful.");
     *         return false;
     *     }
     *     this.myContacts.set(foundPosition, newContact);
     *     System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
     *     return true;
     * }
     */

    public void modifyContact(String findName, String name, String phoneNumber) {
        int position = findContact(findName);
        Contact contact = new Contact(name, phoneNumber);

        if(position >= 0) {
            modifyContact(position, contact);
            System.out.println(findName + " modified");
        }
    }

    public boolean queryContact(String name) {
        for(Contact contact : myContacts) {
            if(contact.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Instructors queryContact solution
     * public String queryContact(Contact contact) {
     *     if(findContact(contact) >= 0) {
     *         return contact.getName();
     *     }
     *     return null;
     * }
     *
     * public Contact queryContact(String name) {
     *     int position = findContact(name);
     *     if(position >= 0) {
     *         return this.myContacts.get(position);
     *     }
     *     return null;
     * }
     */

    /**
     * Instructors removeContact solution
     * public boolean removeContact(Contact contact) {
     *     int foundPosition = findContact(contact);
     *         if(foundPosition < 0) {
     *             System.out.println(contact.getName() + " was not found.");
     *             return false;
     *         }
     *         this.myContacts.remove(foundPosition);
     *         System.out.println(contact.getName() + ", was deleted.");
     *         return true;
     * }
     */

    public void removeContact(String name) {
        int position = findContact(name);

        if(position >= 0) {
            removeContact(position);
            System.out.println(name + " removed");
        }
    }
}
