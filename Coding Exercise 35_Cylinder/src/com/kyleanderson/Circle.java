package com.kyleanderson;

public class Circle {

    double radius;

    public Circle(double radius) {
        if(radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }

    }
}
