package com.sinethemba;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1,1, 5, 5);

        Dog dog = new Dog("Haasi", 10, 20, 2, 4, 1, 15, "long silky");

        dog.eat();

        dog.run();


    }
}
