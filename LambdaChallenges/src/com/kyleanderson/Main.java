package com.kyleanderson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

	//Challenge 1
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                String myString = "Let's split this up into an array";
//                String[] parts = myString.split(" " );
//                for(String part: parts) {
//                    System.out.println(part);
//                }
//            }
//        };
//
//        //Solution
//        Runnable lambdaRunnable = () -> {
//            String myString = "Let's split this up into an array";
//            String[] parts = myString.split(" " );
//            for(String part: parts) {
//                System.out.println(part);
//            }
//        };


        //Challenge 2 Solution
//        Function<String, String> lambdaFunction =  s -> {
//            StringBuilder returnVal = new StringBuilder();
//            for(int i = 0; i < s.length(); i++) {
//                if(i % 2 == 1) {
//                    returnVal.append(s.charAt(i));
//                }
//            }
//            return returnVal.toString();
//        };

        //Challenge 3 Solution
//        System.out.println(lambdaFunction.apply("1234567890"));


        //Challenge 4 Solution
//        Function<String, String> lambdaFunction =  (s) -> {
//            StringBuilder returnVal = new StringBuilder();
//            for(int i = 0; i < s.length(); i++) {
//                if(i % 2 == 1) {
//                    returnVal.append(s.charAt(i));
//                }
//            }
//            return returnVal.toString();
//        };

        //Challenge 5
//        System.out.println(everySecondChar(lambdaFunction, "1234567890"));
//        String result = everySecondChar(lambdaFunction, "1234567890");
//        System.out.println(result);

        //Challenge 6
//        Supplier<String> iLoveJava = () -> "I love Java!";
//        Supplier<String> iLoveJava = () ->  { return "I love Java!"; };

        //Challenge 7
//        String supplierResult = iLoveJava.get();
//        System.out.println(supplierResult);

        //Challenge 9
        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        List<String> firstUpperCaseList = new ArrayList<>();

//        topNames2015.forEach(name ->
//                firstUpperCaseList.add(name.substring(0,1).toUpperCase() + name.substring(1)));
//        firstUpperCaseList.sort((s1, s2) -> s1.compareTo(s2));
//        firstUpperCaseList.forEach(s  -> System.out.println(s));

        //Challenge 10
//        topNames2015.forEach(name ->
//                firstUpperCaseList.add(name.substring(0,1).toUpperCase() + name.substring(1)));
//        firstUpperCaseList.sort(String::compareTo);
//        firstUpperCaseList.forEach(System.out::println);

        //Challenge 11
//        topNames2015.stream()
//                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
//                .sorted(String::compareTo)
//                .forEach(System.out::println);

        //Challenge 12
        long count = topNames2015
                .stream()
                .map(name -> name.substring(0,1).toUpperCase())
                .filter(s->s.startsWith("A"))
                .count();

        System.out.println(count);

    }


    //Challenge 2
//    public static String everySecondChar(String source) {
//        StringBuilder returnVal = new StringBuilder();
//        for(int i = 0; i < source.length(); i++) {
//            if(i % 2 == 1) {
//                returnVal.append(source.charAt(i));
//            }
//        }
//        return returnVal.toString();
//    }


    //Challenge 5
//    public static String everySecondChar(Function<String,String> func, String source) {
//        return func.apply(source);
//    }

}



