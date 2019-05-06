package com.kyleanderson;

public class Main {

    public static void main(String[] args) {
	    // These are the Java Data Primitive types

        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        // This is the "9th" data type: string  - similar to the char type, but it can contain multiple characters

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + "\u00A9 2015";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to: " + lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value: " + lastString);
    }
}
