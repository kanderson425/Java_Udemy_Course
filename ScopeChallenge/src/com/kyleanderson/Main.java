package com.kyleanderson;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner X = new Scanner(System.in);

	printTable(5);
    }

    public static void printTable(int num) {
        System.out.println("The times table for " + num + " is:");
        for(int i = 1; i <= 12; i++) {
            System.out.println(i + " x " + num + " = " + num * i);
        }
    }
}
