package com.kyleanderson;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        Map<String, Integer> tempExit = new HashMap<String, Integer>();
	    locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",tempExit));

        tempExit = new HashMap<String, Integer>();
	    tempExit.put("W",2);
	    tempExit.put("E",3);
	    tempExit.put("S",4);
	    tempExit.put("N",5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));

        tempExit = new HashMap<String, Integer>();
	    tempExit.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));

        tempExit = new HashMap<String, Integer>();
	    tempExit.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));

        tempExit = new HashMap<String, Integer>();
	    tempExit.put("N", 1);
	    tempExit.put("W", 2);
        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));

        tempExit = new HashMap<String, Integer>();
	    tempExit.put("S", 1);
	    tempExit.put("W", 2);
        locations.put(5, new Location(5, "You are in the forest",tempExit));

	    Map<String, String> vocabulary = new HashMap<String, String>();
	    vocabulary.put("QUIT", "Q");
	    vocabulary.put("NORTH", "N");
	    vocabulary.put("SOUTH", "S");
	    vocabulary.put("EAST","E");
	    vocabulary.put("WEST", "W");


	    int loc = 1;
	    while(true) {
            System.out.println(locations.get(loc).getDescription());
            tempExit.remove("S"); // removes the south direction from the map, but b/c we've created a new hashmap within the location class and have made it immutable, this remove method won't have an effect
            if(loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are " );
            for(String exit: exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if(direction.length() > 1) {
                String[] words = direction.split(" ");
                for(String word: words) {
                    if(vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }
//            String direction = scanner.nextLine();
//            String[] splitDirection = direction.split(" ");
//            String convertedDirection = "0";
//
//            for(String i: splitDirection) {
//                if((i.equals("West")) || (i.equals("west")) || (i.equals("w")) || (i.equals("W"))) {
//                    convertedDirection = "W";
//                } else if((i.equals("East"))|| (i.equals("east")) || (i.equals("e")) || (i.equals("E"))) {
//                    convertedDirection = "E";
//                } else if((i.equals("South")) || (i.equals("south")) || (i.equals("s")) || (i.equals("S"))) {
//                    convertedDirection = "S";
//                } else if((i.equals("North")) || (i.equals("north")) || (i.equals("n")) || (i.equals("N"))) {
//                    convertedDirection = "N";
//                } else if((i.equals("Quit")) || (i.equals("quit")) || (i.equals("q")) || (i.equals("Q"))) {
//                    convertedDirection = "Q";
//                }
//            }
            if(exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction");
            }

        }

        //Code Below: Demonstrates the .split method
//        String[] road = "You are standing at the end of a road before a small brick bulding".split(" ");
//        for(String i: road) {
//            System.out.println(i);
//        }
//
//        System.out.println("======================================");
//        String[] building = "You are inside a building, a well house for a small spring".split(", ");
//        for(String i: building) {
//            System.out.println(i);
//        }

    }
}
