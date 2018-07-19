package com.sinethemba;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class League<T extends Team> {

    public String name;
    private ArrayList<T> league = new ArrayList<T>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team){
        if (league.contains(team)){
            System.out.println("Team cannot be added, its already in the league.");
            return false;
        }
        league.add(team);
        System.out.println("Welcome to " + this.name + " " + team.getName());
        return true;
    }

    public void showLeagueTable(){
        Collections.sort(league);
        for (T t : league){
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
