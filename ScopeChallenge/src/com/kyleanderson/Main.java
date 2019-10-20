package com.kyleanderson;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Input a number: ");
	int x = scanner.nextInt();
	x(x);


    }

    public static void x(int x) {
        System.out.println("The times table for " + x + " is:");
        for(int i = 1; i <= 12; i++) {
            System.out.println(x + " x " + i + " = " + i * x);
        }
        System.out.println("Times table for " + x + " is complete.");
    }
}
