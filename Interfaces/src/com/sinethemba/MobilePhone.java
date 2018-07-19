package com.sinethemba;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Mobile phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn){
            System.out.println("Now calling " + phoneNumber + " on a mobile phone.");
        }
        else{
            System.out.println("Phone is switched off");
        }

    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answering the mobile phone.");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn){
            System.out.println("Ring ring");
            isRinging = true;
        }
        else{
            System.out.println("Mobile phone is not on or the number is different");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
