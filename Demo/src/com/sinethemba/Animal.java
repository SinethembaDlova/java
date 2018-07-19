package com.sinethemba;

public class Animal {

    private String name;
    private String speak;

    public Animal(String name, String speak){
        this.name = name;
        this.speak = speak;
    }

    public String speaking(){
        System.out.println(getClass().getSimpleName() + " is speaking: " + this.speak);
        return getClass().getSimpleName() + ": " + this.speak;
    }

    public String getName() {
        return name;
    }

    public String getSpeak() {
        return speak;
    }
}
