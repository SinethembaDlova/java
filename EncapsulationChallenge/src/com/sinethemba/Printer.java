package com.sinethemba;

public class Printer {

    private int tonerLevel;
    private int noOfPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex){

        this.tonerLevel = tonerLevel;
        this.noOfPagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public void fillUpToner() {
        if(tonerLevel == 100){
            System.out.println("The toner level is full already we cant fill up ");
        }
        else{
            this.tonerLevel = 100;
            System.out.println("The toner level has been filled up, it is now " + tonerLevel + "%");
        }

    }

    public void print(int noOfPages){
        if (this.isDuplex == true){
            this.noOfPagesPrinted += ((noOfPages / 2) + (noOfPages % 2));
            System.out.println("You just printed " + noOfPages + " pages, in a duplex printer, we should only need " + noOfPagesPrinted + " papers");
        }
        else{
            this.noOfPagesPrinted += noOfPages;
            System.out.println("You just printed " + noOfPages + " pages, in a non-duplex printer, we should only need " + noOfPagesPrinted + " papers");
        }

    }

    public int getNoOfPagesPrinted(){
        return noOfPagesPrinted;
    }

    public boolean getIsDuplex(boolean duplex) {
        if (duplex = true){
            System.out.println("Your printer is a Duplex, you can print both sides of the page");
            return isDuplex;
        }
        else {
            System.out.println("Your printer is not Duplex you can only print one side.");
            return isDuplex;
        }
    }
}
