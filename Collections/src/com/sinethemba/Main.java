package com.sinethemba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Theatre baxter = new Theatre("Baxter Theatre", 6, 8);

        if (baxter.reserveSeat("A02")){
            System.out.println("Please pay for A02");
        }
        else {
            System.out.println("Seat already reserved");
        }

        if (baxter.reserveSeat("A02")){
            System.out.println("Please pay for A02");
        }
        else {
            System.out.println("Seat already reserved");
        }

        List<Theatre.Seat> reverseSeats = new ArrayList<>(baxter.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(baxter.getSeats());
        priceSeats.add(baxter.new Seat("C00", 13.00));
        priceSeats.add(baxter.new Seat("A00", 13.00));
        priceSeats.add(baxter.new Seat("B00", 10.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);

    }

    public static void printList(List<Theatre.Seat> list){
        for (Theatre.Seat seat: list){
            System.out.print(" " + seat.getSeatNumber() + " is R" + seat.getPrice());
        }
        System.out.println();
        System.out.println("*********************************************************************************************");
    }
}
