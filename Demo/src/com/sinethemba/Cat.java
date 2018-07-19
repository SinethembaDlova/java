package com.sinethemba;

public class Cat extends Animal{

    public Cat(String speak){
        super("Cat", speak);

    }

    @Override
    public String speaking() {
        System.out.println(getClass().getSimpleName() + ": " + super.getSpeak());
        return getClass().getSimpleName() + ": " + super.speaking();
    }
}
