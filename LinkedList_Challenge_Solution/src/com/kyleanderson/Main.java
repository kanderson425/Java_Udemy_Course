package com.kyleanderson;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

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
	albums.get(0).addToPlaylist("Soldier of Fortune", playList);
	albums.get(0).addToPlaylist("Speed King", playList); // DOES NOT EXIST

	albums.get(0).addToPlaylist(5, playList);
	albums.get(1).addToPlaylist(4, playList);
	albums.get(1).addToPlaylist(3, playList);
	albums.get(1).addToPlaylist(2, playList);
	albums.get(1).addToPlaylist(24, playList);	 //There is no track 24

	play(playList);

    }

    private static void play(LinkedList<Song> playList) {
		ListIterator<Song> listeIterator = playList.listIterator();
		if(playList.size() ==0) {
			System.out.println("No songs in playlist");
			return;
		} else {
			System.out.println("Now playing " + listeIterator.next().toString());
		}
	}
}
