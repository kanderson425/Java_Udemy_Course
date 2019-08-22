package com.kyleanderson;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
	    boolean quit = false;
	    int choice = 0;
	    printMenu();
	    while(!quit) {
            System.out.print("Select an option from the menu: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printMenu();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchForContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
	    }
    }

    public static void printMenu() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print the menu.");
        System.out.println("\t 1 - To print list of contacts.");
        System.out.println("\t 2 - To add a contact.");
        System.out.println("\t 3 - To update a contact.");
        System.out.println("\t 4 - To remove a contact.");
        System.out.println("\t 5 - To search for a contact.");
        System.out.println("\t 6 - To quit the application.");
    }


    public static void addContact() {
        System.out.print("Please enter a contact: " );
        mobilePhone.addContactItem(scanner.next());

    }

    public static void updateContact() {
        System.out.print("Current contact name: ");
        String contactName = scanner.nextLine();
        System.out.println("Enter new contact number: ");
        String newContactName = scanner.nextLine();
        mobilePhone.modifyContactList(contactName, newContactName);
    }

    public static void removeContact() {
        System.out.print("Enter contact name ");
        String contactName = scanner.nextLine();
        mobilePhone.removeContact(contactName);
    }


    public static void searchForContact() {
        System.out.print("Name to search for: ");
        String searchContact = scanner.nextLine();
        if(mobilePhone.onFile(searchContact)) {
            System.out.println("Found " + searchContact + " in our contact list");
        } else {
            System.out.println(searchContact + ", not on file.");
        }

    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(mobilePhone.getContactList());

        ArrayList<String> nextArray = new ArrayList<String>(mobilePhone.getContactList());
        String [] myArray = new String[mobilePhone.getContactList().size()];
        myArray = mobilePhone.getContactList().toArray(myArray);
    }

}
