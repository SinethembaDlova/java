package com.sinethemba;

public class Mansion extends House{

    private int floors;
    private int pools;
    private int balcony;

    public Mansion(int rooms, int doors, int windows, String color, int floors, int pools, int balcony){
        super(rooms, doors, windows, color);

        this.floors = floors;
        this.pools = pools;
        this.balcony = balcony;
    }

    public int getFloors() {
        System.out.println("This mansion has " + floors + " floors.");
        return floors;
    }

    public int getPools() {
        System.out.println("This mansion has " + pools + " swimming pools.");
        return pools;
    }

    public int getBalcony() {
        System.out.println("This mansion has " + balcony + " balconies.");
        return balcony;
    }
}
