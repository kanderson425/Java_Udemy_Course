package com.kyleanderson;

public class Series {
    public Series() {

    }

    public static int nSum(int n) {
        int sum = 0;
        for(int i = 0;i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        return sum;

    }

    public static int factorial(int n) {
        int product = 0;
        for(int i=0; i <=n; i++) {
            product *= i;
        }

        System.out.println(product);
        return product;
    }
}
