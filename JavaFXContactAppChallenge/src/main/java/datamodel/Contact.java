package datamodel;

import javafx.beans.property.SimpleStringProperty;

public class Contact {
    // Variables
    private SimpleStringProperty firstName = new SimpleStringProperty("");
    private SimpleStringProperty lastName = new SimpleStringProperty("");
    private SimpleStringProperty phoneNumber = new SimpleStringProperty("");
    private SimpleStringProperty notes = new SimpleStringProperty("");

    // Constructor
    public Contact(String firstName, String lastName, String phoneNumber, String notes) {
        this.firstName.set(firstName); // Sets value of string property
        this.lastName.set(lastName);
        this.phoneNumber.set(phoneNumber);
        this.notes.set(notes);
    }

    public Contact() {
    }

    // Getters/Setters
    public String getFirstName() {
        return firstName.get();
    }

    public SimpleStringProperty firstNameProperty() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public String getLastName() {
        return lastName.get();
    }

    public SimpleStringProperty lastNameProperty() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public String getPhoneNumber() {
        return phoneNumber.get();
    }

    public SimpleStringProperty phoneNumberProperty() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber.set(phoneNumber);
    }

    public String getNotes() {
        return notes.get();
    }

    public SimpleStringProperty notesProperty() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes.set(notes);
    }

    // Override Methods
    @Override
    public String toString() {
        return "Contact: " + "firstName: " + firstName +
                ", lastName: " + lastName + ", phoneNumber: " +
                phoneNumber + ", notes: " + notes;
    }

    // Methods/Functions

}
