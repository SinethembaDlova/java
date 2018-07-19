package com.sinethemba;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{

    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public  boolean addPlayer(T player){
        if (members.contains(player)){
            System.out.println( player.getName() + " is already in a this team");
            return false;
        }
        else {
            members.add(player);
            System.out.println( player.getName() + " was picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers(){
        System.out.println(this.name + " has " + this.members.size() + " players.");
        return this.members.size();
    }

    public void matchResults(Team<T> opponent, int ourScore, int theirScore){
        if (ourScore > theirScore){
            System.out.println("We won again " +  opponent.getName() + ". " + ourScore + "-" + theirScore );
            won++;
            opponent.lost++;
        }
        else if (ourScore == theirScore){
            System.out.println("We drew again " +  opponent.getName() + ". " + ourScore + "-" + theirScore );
            tied++;
            opponent.tied++;
        }
        else {
            System.out.println("We lost again " +  opponent.getName() + ". " + ourScore + "-" + theirScore );
            lost++;
            opponent.won++;
        }
        played++;
        if (opponent == null){
        System.out.println(this.getName() + " " + ourScore + " - " + opponent.getName() + " " + theirScore);
            opponent.matchResults(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()){
            return -1;
        }
        else if (this.ranking() < team.ranking()){
            return 1;
        }
        else {
            return 0;
        }
    }
}
