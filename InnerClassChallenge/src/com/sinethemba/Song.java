package com.sinethemba;

public class Song {

    private String title;
    private double duration;

    public Song(String tittle, double duration) {
        this.title = tittle;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }


    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
