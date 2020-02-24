package com.kyleanderson;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        //Challenge 1
        String challenge1 = "I want a bike.";
//        System.out.println(challenge1.matches("I want a bike."));

        //Challenge2
        String challenge2 = "I want a ball.";
//        System.out.println(challenge2.matches("I want a \\bb.*"));

        //Solution
        String regExp = "I want a \\w+.";
//        System.out.println(challenge1.matches(regExp));
//        System.out.println(challenge2.matches(regExp));

        //Uses the logical | operator and a group
        String regExp1 = "I want a (bike|ball).";
//        System.out.println(challenge1.matches(regExp1));

        //Challenge 3
        String regExp3 = "I want a \\w+.";
        Pattern pattern = Pattern.compile(regExp3);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());

        //Challenge 4
        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll(" ", "_"));
    }
}
