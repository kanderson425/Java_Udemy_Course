package com.kyleanderson;

public class Main {

    public static void main(String[] args) {
//    This is the incorrect way of writing this code: we need to use encapsulation:
//    Player player = new Player();
//    player.name = "Kyle";
//    player.health = 20;
//    player.weapon = "Sword";
//
//    int damage = 10;
//    player.loseHealth(damage);
//    System.out.println("Remaining health = " + player.healthRemaining());
//
//    damage = 11;
//    player.health = 200;
//    player.loseHealth(damage);
//    System.out.println("Remaining health = " + player.healthRemaining());

      EnhancedPlayer player = new EnhancedPlayer("Kyle", 50, "Sword");
        System.out.println("Initial Health is " + player.getHealth());

        //Encapsulation Challenge - Printer

    }
}
