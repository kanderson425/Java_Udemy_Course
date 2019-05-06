package com.kyleanderson;

public class Main {

    public static void main(String[] args) {

	    char myChar = '\u00A9';
	    // width of 16 (2 bytes)
        System.out.println("Unicode output was: " + myChar);

        char registerChar = '\u00AE';
        System.out.println("Unicode output for register is: " + registerChar);

        boolean myBoolean = false;
        boolean isMale = true;
    }
}
