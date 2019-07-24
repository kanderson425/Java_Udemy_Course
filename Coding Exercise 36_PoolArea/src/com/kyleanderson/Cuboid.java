package com.kyleanderson;

public class Cuboid extends Rectangle {

    public double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        if(height < 0) {
            this.height = height;
        }

    }
}
