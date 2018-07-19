package com.sinethemba;

public class Player {

    public String name;
    public int health;
    public String weapon;


    public void loseHealth(int damage){
        this.health = this.health - damage;

        if (this.health <= 0){
            System.out.println("Player knocked out.");
            //reduce number of lives from a player/
        }
    }

    public int remainingHealth() {
        return this.health;
    }
}
