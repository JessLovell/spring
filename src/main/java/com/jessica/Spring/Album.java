package com.jessica.Spring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
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
