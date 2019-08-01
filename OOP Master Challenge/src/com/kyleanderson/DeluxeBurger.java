package com.kyleanderson;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "White","Sausage & Bacon", 14.54);
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);

    }


}
