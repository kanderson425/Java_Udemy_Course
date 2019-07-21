package com.kyleanderson;

public class Main {

    public static void main(String[] args) {
	// write your code here
    BMW bmw = new BMW(36);
    bmw.steer(45);
    bmw.accelerate(30);
    bmw.accelerate(20);
    bmw.accelerate(-42);

    bmw.steer(25);
    bmw.accelerate(-30);

    }
}
