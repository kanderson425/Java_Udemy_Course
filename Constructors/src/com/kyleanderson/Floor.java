package com.kyleanderson;

public class Floor {

    //fields
    private double width;
    private double length;

    //constructors
    public Floor(double width, double length) {
        if(width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if(length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }

    }

    //methods
    public double getArea() {
        return this.width * this.length;
    }
}
