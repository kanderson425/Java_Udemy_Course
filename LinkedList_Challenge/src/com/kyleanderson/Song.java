package com.kyleanderson;

public class Song {

    private String name;
    private double duration;


    public Song(String name, double duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public double getDuration() {
        return duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
