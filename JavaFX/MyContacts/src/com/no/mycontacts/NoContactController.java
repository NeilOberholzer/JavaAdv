package com.no.mycontacts;

import com.no.mycontacts.data.NoContact;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class NoContactController {
    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField contactNumberField;
    @FXML
    private TextField notesField;

    public NoContact getNewContact() {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String contactNumber = contactNumberField.getText();
        String notes = notesField.getText();

        NoContact newContact = new NoContact(firstName, lastName, contactNumber, notes);
        return newContact;
    }

    public void editContact(NoContact contact) {
        firstNameField.setText(contact.getFirstName());
        lastNameField.setText(contact.getLastName());
        contactNumberField.setText(contact.getContactNumber());
        notesField.setText(contact.getNotes());
    }

    public void updateContact(NoContact contact) {
        contact.setFirstName(firstNameField.getText());
        contact.setLastName(lastNameField.getText());
        contact.setContactNumber(contactNumberField.getText());
        contact.setNotes(notesField.getText());
    }
}
