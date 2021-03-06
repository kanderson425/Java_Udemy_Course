package com.kyleanderson;

public class Main {

    public static void main(String[] args) {
	Hamburger hamburger = new Hamburger("Basic","White","Sausage", 3.56);
	double price = hamburger.itemizeHamburger();
	hamburger.addHamburgerAddition1("Tomato", 0.27);
	hamburger.addHamburgerAddition2("lettuce", 0.75);
	hamburger.addHamburgerAddition3("Cheese", 1.12);
	System.out.println("Total price is " + hamburger.itemizeHamburger());

	HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.67);

	healthyBurger.addHamburgerAddition1("Egg", 5.43);
	healthyBurger.addHealthAddition1("Lentils", 3.41);
	System.out.println("total Healthy burger price is " + healthyBurger.itemizeHamburger());

	DeluxeBurger db = new DeluxeBurger();
	db.addHamburgerAddition3("Should not be able to add this", 50.54);
	db.itemizeHamburger();
    }
}
