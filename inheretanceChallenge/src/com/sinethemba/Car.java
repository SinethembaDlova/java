package com.sinethemba;

public class Car extends  Vehicle{

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String color, int size, int wheels, int doors, int gears, boolean isManual, int currentGear) {
        super(name, color, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear){
        this.currentGear = currentGear;
        System.out.println("Car.changeGear(): Change to " + this.currentGear + "");
    }

    public void changeVelocity(int speed, int direction){
        System.out.println("Car.changeVelocity : Change velocity to " + speed +" in direction " + direction);
        move(speed, direction);
    }
}
