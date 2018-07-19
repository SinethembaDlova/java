package com.sinethemba;

public class Main {

    public static void main(String[] args) {

        Golf golf = new Golf(12);
        golf.steer(30);
        golf.acceralate(50);
        golf.acceralate(20);
        golf.acceralate(-50);
    }
}
