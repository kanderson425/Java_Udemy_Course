package com.kyleanderson;

public class Hamburger {
    private String name;
    private String rollType;
    private String meatType;
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private int basePrice;

    public Hamburger(String rollType, String meatType, int basePrice) {
        this.name = "Hamburger";
        this.rollType = rollType;
        this.meatType = meatType;
        this.basePrice = basePrice;
    }
}
