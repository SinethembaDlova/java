package com.sinethemba;

public class House {

    private int rooms;
    private int doors;
    private int windows;
    private String color;

    public House(int rooms, int doors, int windows, String color){
        this.rooms = rooms;
        this.doors = doors;
        this.windows = windows;
        this.color = color;
    }

    public void extendHouse(int moreRooms){
        System.out.println("Your house had " + rooms + " and now has been extended by " + moreRooms + " rooms.");
        this.rooms += moreRooms;
        System.out.println("Your house now have " + rooms + " rooms.");
    }

    public int getRooms(){
        System.out.println("This house has " + rooms + " rooms.");
        return rooms;
    }

    public int getDoors(){
        System.out.println("This house has " + doors + " doors.");
        return doors;
    }

    public int getWindows(){
        System.out.println("This house has " + windows + " windows.");
        return windows;
    }

    public String color(){
        System.out.println("This is a " + color + " house.");
        return color;
    }

}
