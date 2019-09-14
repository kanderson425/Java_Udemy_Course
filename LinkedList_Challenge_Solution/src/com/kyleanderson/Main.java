package com.kyleanderson;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
	Album album = new Album("Stormbringer", "Deep Purple");
	album.addSong("Stormbringer", 4.6);
	album.addSong("Soldier of Fortune", 3.13);
	album.addSong("Space Truckin'", 5.2);
	albums.add(album);

	album = new Album("For those about to rock", "AC/DC");
	album.addSong("For those about to rock", 5.44);
	album.addSong("Highway to Hell", 3.25);

	albums.add(album);

	LinkedList<Song> playList = new LinkedList<Song>();
	albums.get(0).addToPlaylist("Stormbringer", playList);




    }
}
