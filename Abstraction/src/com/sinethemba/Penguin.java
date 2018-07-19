package com.sinethemba;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Thats not my expertise, lets go for a swim instead.");
    }
}
