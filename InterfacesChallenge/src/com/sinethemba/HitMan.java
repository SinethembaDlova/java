package com.sinethemba;

import java.util.ArrayList;
import java.util.List;

public class HitMan implements ISaveable{

    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public HitMan(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Gun";
    }

    public String getName() {
        return name;
    }


    public int getHitPoints() {
        return hitPoints;
    }


    public int getStrength() {
        return strength;
    }


    public String getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        return "HitMan{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<String>();

        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);
        values.add(3, "" + this.weapon);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0){
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }
    }
}
