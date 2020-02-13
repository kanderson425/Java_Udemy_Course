package com.kyleanderson;

public class Main {

    public static void main(String[] args) {

	//Challenge 1
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String myString = "Let's split this up into an array";
                String[] parts = myString.split(" " );
                for(String part: parts) {
                    System.out.println(part);
                }
            }
        };

        //Solution
        Runnable lambdaRunnable = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" " );
            for(String part: parts) {
                System.out.println(part);
            }
        };

        lambdaRunnable.run();

    }
}
