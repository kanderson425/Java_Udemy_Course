package com.kyleanderson;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger( String meat, double price) {
        super("Healthy","Brown Rye", meat, price);
    }
}
