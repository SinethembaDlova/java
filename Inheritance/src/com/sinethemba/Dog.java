package com.sinethemba;

public class Dog extends Animal{

    private int eyes;
    private  int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail =tail;
        this.teeth = teeth;
        this.coat = coat;

        System.out.println("A new dog animal is created.");
    }


    private void chew(){
        System.out.println("chew method called in dog");
    }

    @Override
    public void eat() {
        System.out.println("eat method in dog is called");
        chew();
        super.eat();
    }

    public void walk (){
        System.out.println("walk method is called in dog");
        move(5);
    }

    public void run (){
        System.out.println("run method is called in dog");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("moveLegs method in dog is called.");
    }

    @Override
    public void move(int speed) {
        System.out.println("move method in dog is called.");
        moveLegs(speed);
        super.move(speed);
    }
}
