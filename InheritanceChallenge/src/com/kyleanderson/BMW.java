package com.kyleanderson;

public class BMW extends Car {
    private int roadServiceMonths;

    public BMW(int roadServiceMonths) {
        super("BMW", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
}
