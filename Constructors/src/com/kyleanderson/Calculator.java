package com.kyleanderson;

public class Calculator {

    //fields
    private Floor floor;
    private Carpet carpet;

    //constructor
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    //methods
    public double getTotalCost() {
        return carpet.getCost() * floor.getArea();
    }
}
