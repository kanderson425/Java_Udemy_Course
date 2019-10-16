package com.kyleanderson;




public class Main {

    public static void main(String[] args) {
        for(int i=0; i<= 10; i++) {
            Series.nSum(i);
        }

        System.out.println("**************************");

        for(int i=0; i<=10; i++) {
            Series.factorial(i);
        }

        System.out.println("**************************");

        for(int i=0; i<=10; i++) {
            Series.fibonnaci(i);
        }
    }
}
