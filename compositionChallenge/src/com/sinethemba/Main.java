package com.sinethemba;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("East");
        Wall wall2 = new Wall("West");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 5);

        Bed bed = new Bed("Modern", 4, 5, 3, 1);

        Lamp lamp = new Lamp("Modern", true, 90);

        Room Bedroom = new Room("Bedroom",wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        Bedroom.makeBed();


        Bedroom.getLamp().turnOn();
    }
}
