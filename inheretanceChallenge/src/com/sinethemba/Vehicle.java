package com.sinethemba;

public class Vehicle {

    private String name;
    private String color;
    private int size;

    private int currentVelocity;
    private int currentDirection;


    public Vehicle(String name, String color, int size){
        this.name = name;
        this.color = color;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer() Steering at " + currentDirection + " degrees.");
    }

    public void move(int velocity, int direction){
        this.currentVelocity = velocity;
        this.currentDirection = direction;

        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public void stop(){
        this.currentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
