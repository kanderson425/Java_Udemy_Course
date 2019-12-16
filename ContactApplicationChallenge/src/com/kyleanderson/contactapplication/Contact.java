package com.kyleanderson.contactapplication;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Contact {
    private SimpleStringProperty firstName;
    private SimpleStringProperty lastName;
    private SimpleStringProperty phoneNumber;
    private SimpleStringProperty notes;

    public Contact(String firstName, String lastName, String phoneNumber, String notes) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.phoneNumber = new SimpleStringProperty(phoneNumber);
        this.notes = new SimpleStringProperty(notes);
    }

    //getter
    public String getFirstName() {
        return firstName.get();
    }
    //setter
    public void setFirstName(String value) {
        firstName.set(value);
    }
    //property accessor
    public SimpleStringProperty firstNameProperty() {
        return firstName;
    }

    //getter
    public String getLastName() {
        return lastName.get();
    }
    //setter
    public void setLastName(String value) {
        lastName.set(value);
    }
    //property accessor
    public SimpleStringProperty lastNameProperty() {
        return lastName;
    }


    //getter
    public String getPhoneNumber() {
        return phoneNumber.get();
    }
    //setter
    public void setPhoneNumber(String value) {
        phoneNumber.set(value);
    }
    //property accessor
    public SimpleStringProperty phoneNumberProperty() {
        return phoneNumber;
    }


    //getter
    public String getNotes() {
        return notes.get();
    }
    //setter
    public void setNotes(String value) {
        notes.set(value);
    }
    //property accessor
    public SimpleStringProperty notesProperty() {
        return notes;
    }

}
