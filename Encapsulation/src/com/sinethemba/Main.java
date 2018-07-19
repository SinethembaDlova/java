package com.sinethemba;

public class Main {

    public static void main(String[] args) {

        Player player = new Player();

        player.name = "Sinethemba";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;

        player.loseHealth(damage);
        System.out.println("Player " + player.name + " has a remaing health of " + player.remainingHealth());

        player.loseHealth(11);
        System.out.println("Player " + player.name + " has a remaing health of " + player.remainingHealth());
    }
}
