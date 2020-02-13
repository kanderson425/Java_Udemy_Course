package com.kyleanderson;

import java.util.function.Function;

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
        Function<String, String> lambdaFunction =  (s) -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i = 0; i < s.length(); i++) {
                if(i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            System.out.println(returnVal.toString());
            return returnVal.toString();
        };

        everySecondChar(lambdaFunction);
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



    public static String everySecondChar(Function<String,String> func) {
        return func.apply("1234567890");
    }

}



