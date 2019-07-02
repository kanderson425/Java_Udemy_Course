package com.kyleanderson;

public class Point {

    //fields
    private int x;
    private int y;

    //constructors
    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //methods
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return distance(0,0);
    }

    public double distance(Point point) {
        double distance = Math.sqrt(((point.x - this.x) * (point.x - this.x)) + ((point.y - this.y) * (point.y-this.y)));
        return distance;
    }

    public double distance(int x, int y) {
        double distance = Math.sqrt(((x - this.x) * (x - this.x)) + ((y - this.y) * (y-this.y)));
        return distance;
    }
}
