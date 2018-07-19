package com.sinethemba;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Sporty");
        dog.eat();
        dog.breathe();

        System.out.println("*****************");

        Parrot parrot = new Parrot("South African ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        System.out.println("*****************");

        Penguin penguin = new Penguin("Emporor");
        penguin.fly();

    }
}
