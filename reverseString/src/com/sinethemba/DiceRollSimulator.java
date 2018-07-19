package com.sinethemba;

public class DiceRollSimulator {

        private int sides;
        private int score;

        public DiceRollSimulator() {
            this.sides = (int) (Math.random() * 6 + 1);
            this.score = 0;
        }

        public void roll(){
            System.out.println("You have rolled " + sides);
            if (sides == 6){
                this.score += 6;
                System.out.println("Awesome, you have gained six points");
            }
            else if (sides == 5){
                this.score+=5;
                System.out.println("Great try, you have gained five points");
            }
            else{
                System.out.println("No points for you, you're so lame.");
            }
        }

}
