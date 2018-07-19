package com.sinethemba;

public class Animal {

    private String name;
    private int brain;
    private  int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight){
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;

        System.out.println("A new animal is created.");
    }

    public void eat(){
        System.out.println("eat method from Animal is called.");
    }

    public void move(int speed){
        System.out.println("Move method is called in Animal. Animal is moving at " + speed + ".");
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

}
