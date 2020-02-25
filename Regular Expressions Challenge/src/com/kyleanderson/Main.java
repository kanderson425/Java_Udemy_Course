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
        System.out.println(challenge4.replaceAll("\\s", "_"));

        //Challenge 5
        String challenge5 = "aaabccccccccdddefffg";
        String regExp5 = "[a-g]*";
        String regExp52= "[abcdefg]+";
        System.out.println(challenge5.matches(regExp5));

        //Challenge 6
        String challenge6 = "aaabccccccccdddefffg";
        String regExp6 = "^[a]{3}bc{8}[d]{3}e[f]{3}g$";
        System.out.println(challenge6.matches(regExp6));
        System.out.println(challenge6.replaceAll("^a{3}bc{8}d{3}ef{3}g$","REPLACED"));

        //Challenge 7
        String challenge7 = "abcd.135";
        String wrongChallenge7 = "f5.12a";
        String regExp7 = "^[a-zA-Z]+.[0-9]+";
        String solutionRegExp7 = "^[A-Z][a-z]+\\.\\d+$"; //solution from the lesson, however didn't work
        System.out.println(challenge7.matches(solutionRegExp7));
        System.out.println(wrongChallenge7.matches(regExp7));

        //Challenge 8
        System.out.println("***********************");
        String challenge8 = "abcd.135uvqz.7tzik.999";
        String regExp8GroupPattern = "(\\d+)";
        Pattern pattern8 = Pattern.compile(regExp8GroupPattern);
        Matcher matcher8 = pattern8.matcher(challenge8);
        matcher8.reset();

        while(matcher8.find()) {
            System.out.println("Occurrences: " + matcher8.group(1));
        }


    }
}
