package com.sinethemba;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Int has a width of a 32
        int minIntValue = -2_147_483_648;
        int maxIntValue = 2_147_483_457;

        //Int has a width of a 8
        byte minByteValue = -128;
        byte maxByteValue = 127;

        //Int has a width of a 16
        short minShortValue = -32768;
        short maxShortValue = 32767;

        //Int has a width of a 64
        long minLongValue = -9_223_372_036_854_775_808L;
        long maxLongValue = 9_223_372_036_854_775_807L;

        long newLongValue =  50000L + 10L * (minIntValue + minByteValue + minShortValue);
        short newShortValue = (short) (10000 + 10 * (minByteValue + minIntValue + newLongValue));

        System.out.println(newLongValue);
        System.out.println((newShortValue));
    }


}
