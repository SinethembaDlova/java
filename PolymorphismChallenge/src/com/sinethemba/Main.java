package com.sinethemba;

class Car{

    private boolean gotEngine;
    private int cylinder;
    private String name;
    private int wheels;

    public Car(int cylinder, String name) {
        this.cylinder = cylinder;
        this.name = name;
        this.wheels = 4;
        this.gotEngine = true;
    }

    public String startEngine(){
        System.out.println(getClass().getSimpleName() + " is starting.");
        return getClass().getSimpleName() + " => Is starting";
    }

    public String accelerate(){
        System.out.println(getClass().getSimpleName() + " is accelerating.");
        return getClass().getSimpleName() + " => Is accelerating.";
    }

    public String brake(){
        System.out.println(getClass().getSimpleName() + " is braking.");
        return getClass().getSimpleName() + " => Is braking";
    }


    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }

}

class Benz extends Car{

    public Benz(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName() + " is starting.");
        return getClass().getSimpleName() + " => Is starting";
    }

    @Override
    public String accelerate() {
        System.out.println(getClass().getSimpleName() + " is accelerating.");
        return getClass().getSimpleName() + " => Is accelerating";
    }

    @Override
    public String brake() {
        System.out.println(getClass().getSimpleName() + " is braking.");
        return getClass().getSimpleName() + " => Is braking";
    }
}

class Golf extends Car{

    public Golf(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName() + " is starting.");
        return getClass().getSimpleName() + " => Is starting";
    }

    @Override
    public String accelerate() {
        System.out.println(getClass().getSimpleName() + " is accelerating.");
        return getClass().getSimpleName() + " => Is accelerating";
    }

    @Override
    public String brake() {
        System.out.println(getClass().getSimpleName() + " is braking.");
        return getClass().getSimpleName() + " => Is braking";
    }
}

class Mazda extends Car{

    public Mazda(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName() + " is starting.");
        return getClass().getSimpleName() + " => Is starting";
    }

    @Override
    public String accelerate() {
        System.out.println(getClass().getSimpleName() + " is accelerating.");
        return getClass().getSimpleName() + " => Is accelerating";
    }

    @Override
    public String brake() {
        System.out.println(getClass().getSimpleName() + " is braking.");
        return getClass().getSimpleName() + " => Is braking";
    }
}

public class Main {

    public static void main(String[] args) {

        Car car = new Car(8, "Bonani");
        car.startEngine();
        car.accelerate();
        car.brake();

        System.out.println("\n");
        Benz benz = new Benz(12, "Bonjo");
        benz.startEngine();
        benz.accelerate();
        benz.brake();

        System.out.println('\n');
        Golf golf = new Golf(12, "Bhalaza");
        golf.startEngine();
        golf.accelerate();
        golf.brake();

        System.out.println('\n');
        Mazda mazda = new Mazda(12, "Bhalaza");
        mazda.startEngine();
        mazda.accelerate();
        mazda.brake();
    }
}
