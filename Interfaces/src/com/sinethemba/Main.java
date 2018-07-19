package com.sinethemba;

public class Main {

    public static void main(String[] args) {

        ITelephone timsPhone;
        timsPhone = new DeskPhone(10111);

        timsPhone.powerOn();
        timsPhone.isRinging();
        timsPhone.answer();
        timsPhone.callPhone(10111);
        timsPhone.dial(152455);

        System.out.println("\n**************\n");

        timsPhone = new MobilePhone(52121);
        timsPhone.powerOn();
        timsPhone.callPhone(52121);
        timsPhone.answer();
    }
}
