package com.kyleanderson;

public class Wall {

    //fields
    private double width;
    private double height;

    //constructors
    public Wall() {
        this(0.00, 0.00);

    }

    public Wall(double width, double height) {
        if( width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if(height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    //methods
    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        if(width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if(height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return this.width * this.height;
    }
}
