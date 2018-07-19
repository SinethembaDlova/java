package com.sinethemba;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(20, false);

        printer.fillUpToner();
        printer.print(6);

    }
}
