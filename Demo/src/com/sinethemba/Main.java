package com.sinethemba;

public class Main {

    public static void main(String[] args) {

	    Animal animal = new Animal("X", "dfvmkefpjerf");
	    animal.speaking();

        System.out.println("\n");


        Cat cat = new Cat("MEOW");
        cat.speaking();

        System.out.println("\n");

        Dog dog = new Dog("Haaaawwww");
        dog.speaking();
    }
}
