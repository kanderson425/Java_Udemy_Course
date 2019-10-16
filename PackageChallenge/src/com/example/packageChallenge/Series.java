package com.example.packageChallenge;

public class Series {
    public Series() {

    }

    public static long nSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        return sum;

    }

    public static long factorial(int n) {
        int product = 1;
        if (n == 0) {
            product = 1;
        } else {
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
        }
        System.out.println(product);
        return product;
    }

    public static long fibonnaci(int n) {
        if(n == 0) {
            System.out.println(0);
            return 0;
        } else if(n == 1) {
            System.out.println(1);
            return 1;
        }
        long nMinus1  = 1;
        long nMinus2 = 0;
        long fib = 0;
        for(int i=1; i<n; i++) {
            fib = (nMinus2 + nMinus1);
            nMinus2 = nMinus1;
            nMinus1 = fib;
        }
        System.out.println(fib);
        return fib;
    }
}