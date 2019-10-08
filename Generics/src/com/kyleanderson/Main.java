package com.kyleanderson;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>(); // You do not need the "Integer" in the second diamond brackets. The second set inherits from the first per version 8 of Java

        items.add(1);
        items.add(2);
        items.add(3);
//        items.add("Kyle");
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

	private static void printDoubled(ArrayList<Integer> n) {
	    for(int i : n) {
            System.out.println( i * 2);
        }
    }
}
