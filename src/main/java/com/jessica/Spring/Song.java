package com.jessica.Spring;

import javax.persistence.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public long id;
    public String title;
    public double lengthInSeconds;
    public int trackNum;

    @ManyToOne
    public Album album;

    public Song() {}

    public Song(String title, double lengthInSeconds, int trackNum) {
        this.title = title;
        this.lengthInSeconds = lengthInSeconds;
        this.trackNum = trackNum;
    }

    public String toString() {
        return this.title;
    }
}
