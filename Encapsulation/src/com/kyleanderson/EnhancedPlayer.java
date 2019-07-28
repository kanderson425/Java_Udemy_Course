package com.kyleanderson;

public class EnhancedPlayer {

    private String name;
    private int health = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health >0 && health <= 200) {
            this.health = health;
        }
        this.weapon = weapon;
    }
}
