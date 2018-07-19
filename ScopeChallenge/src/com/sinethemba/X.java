package com.sinethemba;

import java.util.Scanner;

public class X {

    private  int x;

    public X(Scanner x) {
        System.out.println("Kindly please enter a number: ");
        this.x = x.nextInt();
    }

    public void x(){
        for (int x = 1; x < 15; x++){
            System.out.println(x + " times " + this.x + " equals " + (x * this.x));
        }
    }
}
