package com.kyleanderson;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

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
	album.addSong("Hells Bells", 3.25);
	album.addSong("You shook me all night long", 3.25);

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
    	Scanner scanner = new Scanner(System.in);
    	boolean quit = false;
    	boolean forward = true;
		ListIterator<Song> listeIterator = playList.listIterator();
		if(playList.size() ==0) {
			System.out.println("No songs in playlist");
			return;
		} else {
			System.out.println("Now playing " + listeIterator.next().toString());
		}
		while(!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();

			switch(action) {
				case 0:
					System.out.println("Playlist complete.");
					quit = true;
					break;
				case 1:
					if(!forward) {
						if(listeIterator.hasNext()) {
							listeIterator.next();
						}
						forward = true;
					}
					if(listeIterator.hasNext()) {
						System.out.println("Now playing " + listeIterator.next().toString());
					} else {
						System.out.println("We have reached the end of the playlist");
						forward = false;
					}
					break;
				case 2:
					if(forward) {
						if(listeIterator.hasPrevious()) {
							listeIterator.previous();
						}
						forward = false;
					}
					if(listeIterator.hasPrevious()) {
						System.out.println("Now playing " + listeIterator.previous().toString());
					} else {
						System.out.println("We have reached the start of the playlist");
						forward = true;
					}
					break;
				case 3:
					break;
				case 4:
//					printList(playlist);
					break;
				case 5:
//					printMenu();
					break;
			}
		}
	}
}
