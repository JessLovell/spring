package com.jessica.Spring;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(mappedBy="album")
    public List<Song> songs;

    public Album() {
    }

    public Album(String title, String artist, int songCount, double lengthInSeconds, String imageURL){
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.lengthInSeconds = lengthInSeconds;
        this.imageURL = imageURL;
    }

    public String toString() {
        return this.title + " is an album by " + this.artist;
    }
}
