package com.sinethemba;

public class Golf extends Car{
    private int roadServiceMonths;

    public Golf(int roadServiceMonths) {
        super("Gold", ":Red", 500, 4, 4, 1, false, 1);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void acceralate(int rate){

        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0){
            stop();
        }
        else if (newVelocity > 10 && newVelocity <= 20){
            changeGear(1);
        }

        else if (newVelocity > 20 && newVelocity <= 30){
            changeGear(2);
        }

        else if (newVelocity > 30 && newVelocity <= 40){
            changeGear(3);
        }

        else if (newVelocity > 40 && newVelocity <= 50){
            changeGear(4);
        }

        else{
            changeGear(5);
        }


        if (newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
