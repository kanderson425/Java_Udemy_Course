package com.kyleanderson;
import java.util.Scanner;


public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    boolean quit = false;
	    int choice = 0;
	    printMenu();
	    while(!quit) {
            System.out.println("Select an option from the menu: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printMenu();
                    break;
                case 1:
                    printContacts();
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
        System.out.println("\n 0 - To print the menu.");
        System.out.println("\n 1 - To print list of contacts.");
        System.out.println("\n 2 - To add a contact.");
        System.out.println("\n 3 - To update a contact.");
        System.out.println("\n 4 - To remove a contact.");
        System.out.println("\n 5 - To search for a contact.");
        System.out.println("\n 6 - To quit the application.");
    }
}
