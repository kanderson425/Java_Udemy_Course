package com.example.packageChallenge;

public class Series {
    public Series() {

    }

    public static int nSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        return sum;

    }

    public static int factorial(int n) {
        int product = 1;
        if (n == 0) {
            product = 0;
        } else {
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
        }
        System.out.println(product);
        return product;
    }

    public static int fibonnaci(int n) {
        int a = 0, b = 1, c;
        if (n == 0) {
            return a;
        } else {
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
        }
        System.out.println(b);
        return b;
    }
}