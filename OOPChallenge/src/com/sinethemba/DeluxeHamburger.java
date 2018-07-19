package com.sinethemba;

public class DeluxeHamburger extends  Hamburger{

    public DeluxeHamburger() {
        super("Deluxe", "white", "Sausage & Bacon", 15);

        super.addHamburgerAddition1("Chips", 10);
        super.addHamburgerAddition2("Drink", 8);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Sorry, you can't add extra items to a deluxe hamburger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Sorry, you can't add extra items to a deluxe hamburger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Sorry, you can't add extra items to a deluxe hamburger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Sorry, you can't add extra items to a deluxe hamburger");
    }
}
