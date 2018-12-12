package com.jessica.Spring;

public class Album {

    public long id;
    public String title;
    public String artist;
    public int songCount;
    public double lengthInSeconds;
    public String imageURL;

    public Album(String title, String artist){
        this.title = title;
        this.artist = artist;
        this.songCount = 0;
        this.lengthInSeconds = 0;
        this.imageURL = null;
    }

    public String toString() {
        return this.title + " is an album by " + this.artist;
    }
}
