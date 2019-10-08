package com.kyleanderson;

import java.util.ArrayList;

public class League<T> {
    private String name;
    int wins = 0;


    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
