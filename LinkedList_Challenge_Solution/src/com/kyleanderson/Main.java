package com.kyleanderson;

import java.util.*;

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
		ListIterator<Song> listIterator = playList.listIterator();
		if(playList.size() ==0) {
			System.out.println("No songs in playlist");
			return;
		} else {
			System.out.println("Now playing " + listIterator.next().toString());
			printMenu();
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
						if(listIterator.hasNext()) {
							listIterator.next();
						}
						forward = true;
					}
					if(listIterator.hasNext()) {
						System.out.println("Now playing " + listIterator.next().toString());
					} else {
						System.out.println("We have reached the end of the playlist");
						forward = false;
					}
					break;
				case 2:
					if(forward) {
						if(listIterator.hasPrevious()) {
							listIterator.previous();
						}
						forward = false;
					}
					if(listIterator.hasPrevious()) {
						System.out.println("Now playing " + listIterator.previous().toString());
					} else {
						System.out.println("We have reached the start of the playlist");
						forward = true;
					}
					break;
				case 3:
					if(forward) {
						if(listIterator.hasPrevious()) {
							System.out.println("Now replaying " + listIterator.previous().toString());
							forward = false;
						} else {
							System.out.println("We are at the start of the list");

						}
					} else {
						if(listIterator.hasNext()) {
							System.out.println("Now replaying " + listIterator.next().toString());
							forward = true;
						} else {
							System.out.println("We have reached the end of the list");
						}
					}
					break;
				case 4:
//					printList(playlist);
					break;
				case 5:
					printMenu();
					break;
			}
		}
	}

	private static void printMenu() {
		System.out.println("Available actions:\npress");
		System.out.println("0 - to quit\n" +
				"1 - to play next song\n" +
				"2 - to play previous song\n" +
				"3 - to replay the current song\n" +
				"4 - list songs in playlist\n" +
				"5 - print available actions.");
	}

	private static void printList(LinkedList<Song> playList) {
		Iterator<Song> iterator = playList.iterator();
		System.out.println("====================");
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
		System.out.println("===========================");
	}

}


