package org.example;

public class Movie extends LibraryItem{
    protected int durationInMinutes;
    public Movie(String title, String author, int year, int trackCount){
        super(title, author, year);
        this.durationInMinutes = trackCount;
    }
    public int getDurationInMinutes() {
        return durationInMinutes;
    }
    public String  toString(){
        return "Movie: " + title + " by " + author + " (" + year + ") - " + durationInMinutes + " minutes";
    }
}
