package com.sinethemba;

public class Car {

    private int doors;
    private int wheels;
    private int windows;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("amg") || validModel.equals("seven series")){
            this.model = model;
        }
        else{
            this.model = "Unkown model";
        }
    }

    public String getModel(){
        return "The model of this car " + " is " + this.model;
    }
}
