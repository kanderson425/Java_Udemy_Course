package com.kyleanderson;
import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<String> contactList = new ArrayList<String>();

    public void addContactItem(String name, String number) {

    }

    public void printContacts() {
        System.out.println("You have " + contactList.size() + " contacts in your contact list.");
        for(int i = 0; i<contactList.size(); i++) {
            System.out.println((i+1) + ". " + contactList.get(i));
        }
    }

    public void modifyContactList(String currentContact, String newContact) {
        int position = findContact(currentContact);
        if(position >= 0) {
            modifyContactList(position, newContact);
        }
    }

    private void modifyContactList(int position, String newContact) {
        contactList.set(position, newContact);
        System.out.println("Contac " + (position+1) + " has been modified.")
    }

    public void removeContact(String contact) {
        int position = findContact(contact);
        if(position >= 0) {
            removeContact(position);
        }
    }



}
