package com.sinethemba;

public class Lion extends Animal{

    public Lion(String speak) {
        super("Lion", speak);
    }

    @Override
    public String speaking() {
        System.out.println(getClass().getSimpleName() + ": " + super.getSpeak());
        return getClass().getSimpleName() + ": " + super.speaking();
    }
}
