package com.kyleanderson;

public class Main {

    public static void main(String[] args) {
	Hamburger hamburger = new Hamburger("Basic","White","Sausage", 3.56);
	double price = hamburger.itemizeHamburger();
	hamburger.addHamburgerAddition1("Tomato", 0.27);
	hamburger.addHamburgerAddition2("lettuce", 0.75);
	hamburger.addHamburgerAddition3("Cheese", 1.12);
	System.out.println("Total price is " + hamburger.itemizeHamburger());

    }
}
