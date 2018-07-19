package com.sinethemba;

public class HealthyHamburger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyHamburger(String meat, double price){
        super("Healthy","Brown rye", meat, price);

    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizedHamburger() {
        double healthyHamburgerPrice = super.itemizedHamburger();


        if (this.healthyExtra1Name != null){
            healthyHamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for the price of R" + this.healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null){
            healthyHamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for the price of R" + this.healthyExtra2Price);
        }

        System.out.println("Your total price for the healthy hamburger is now R" + healthyHamburgerPrice);
        return healthyHamburgerPrice;
    }
}
