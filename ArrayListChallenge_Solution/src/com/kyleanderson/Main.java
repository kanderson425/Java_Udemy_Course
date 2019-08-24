package com.kyleanderson;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");


    public static void main(String[] args) {
	    boolean quit = false;
	    startPhone();
	    printActions();
	    while(!quit) {

        }
    }
    private static void startPhone() {
        System.out.println("Starting phone...");
    }
}
