package com.sinethemba;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Hot dog", "White roll", "Sausage", 10.0 );
        hamburger.itemizedHamburger();

        System.out.println('\n');

        HealthyHamburger healthyHamburger = new HealthyHamburger("Bacon", 20);
        healthyHamburger.addHealthyAddition1("Egg", 5.0);
        healthyHamburger.addHealthyAddition2("Letus", 10);
        healthyHamburger.itemizedHamburger();

        System.out.println("\n");


        DeluxeHamburger deluxeHamburger = new DeluxeHamburger();
        deluxeHamburger.addHamburgerAddition1("Chicken", 25);
        deluxeHamburger.itemizedHamburger();


    }
}
