package com.kyleanderson;

public abstract class Team {
    private String name;
    private int wins;

    public Team(String name) {
        this.name = name;
        this.wins = wins;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }
}
