package com.kyleanderson.Model;

/**
 * Created by kyleanderson on Mar 15, 2020
 */
public class Album {

    private int id;
    private String name;
    private int artistId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }
}
