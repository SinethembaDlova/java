package com.sinethemba;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 10);
        Case pcCase = new Case("220B","Dell","240", dimensions);

        Monitor pcMonitor = new Monitor("27Inch Beast", "Dell", 30, new Resolution(2540, 1440));

        Motherboard pcMotherboard = new Motherboard("BJ-200", "G-force",4, 6, "v2.444");

        PC myPC = new PC(pcCase, pcMonitor, pcMotherboard);
        myPC.powerUp();
    }
}
