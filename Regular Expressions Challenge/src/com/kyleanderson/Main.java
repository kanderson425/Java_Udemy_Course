package com.kyleanderson;

public class Main {

    public static void main(String[] args) {

        //Challenge 1
        String challenge1 = "I want a bike.";
//        System.out.println(challenge1.matches("I want a bike."));

        //Challenge2
        String challenge2 = "I want a ball.";
        String challenge3 = "ball";
        System.out.println(challenge2.matches("I want a \\bb.*"));

    }
}
