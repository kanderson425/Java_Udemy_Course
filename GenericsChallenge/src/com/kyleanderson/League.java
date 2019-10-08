package com.kyleanderson;

import java.util.ArrayList;

public class League<T> implements Comparable<League<T>>{
    private String name;
    int wins = 0;


    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if(teams.contains(team)) {
            System.out.println(((Team) team).getName() + " is already in the league.");
            return false;
        } else {
            teams.add(team);
            System.out.println(((Team) team).getName() + " added to this league: " + this.name);
            return true;
        }
    }

    public int ranking() {
        return (wins * 2);
    }

    @Override
    public int compareTo(League<T> team) {
        if(this.ranking() > team.ranking()) {
            return -1;
        } else if(this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }


}
