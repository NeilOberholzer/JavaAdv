package com.no.mycontacts.data;

import javafx.beans.property.SimpleStringProperty;

public class NoContact {
    private SimpleStringProperty firstName = new SimpleStringProperty("");
    private SimpleStringProperty lastName = new SimpleStringProperty("");
    private SimpleStringProperty contactNumber = new SimpleStringProperty("");
    private SimpleStringProperty notes = new SimpleStringProperty("");

    public NoContact() {
    }

    public NoContact(String firstName, String lastName, String contactNumber, String notes) {
        this.firstName.set(firstName);
        this.lastName.set(lastName);
        this.contactNumber.set(contactNumber);
        this.notes.set(notes);
    }

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

    public String getContactNumber() {
        return contactNumber.get();
    }

    public SimpleStringProperty contactNumberProperty() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber.set(contactNumber);
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

    @Override
    public String toString() {
        return "Contact{firstName=" + firstName + ", lastName=" + ", contactNumber=" + contactNumber + ", notes=" + notes + "}";
    }
}
