package com.kyleanderson;

import java.util.*;

public class Playlist {
    private ArrayList<Album> playlist;

    public Playlist(ArrayList<Album> playlist) {
        this.playlist = playlist;
    }

    private static void printPlaylist(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Moving on to next song: " + i.next());
        }
        System.out.println("=========================");
    }

    public boolean addSong(String albumName, String songName, double duration) {
        Album album = findAlbum(albumName);
        if(album != null) {
            return album.addSong(songName, duration);
        }
        return false;
    }

    public Album findAlbum(String albumName) {
        for(int i = 0; i<playlist.size(); i++) {
            Album checkedAlbum = this.playlist.get(i);
            if(checkedAlbum.getName().equals(albumName)) {
                return checkedAlbum;
            }
        }
        return null;
    }

    private static void playlistAction(LinkedList playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = playlist.listIterator();

        if(playlist.isEmpty()) {
            System.out.println("No songs in the playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next());
            printMenu();
        }
        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case 0:
                    System.out.println("Music has now stopped");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the playlist");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous());
                    } else {
                        System.out.println("We are at the first song of the playlist");
                        goingForward = true;
                    }
                    break;
                case 3:
                    System.out.println("Song is attempting to replay");
                    break;
                case 4:
                    System.out.println("Attempting to list all songs in playlist");
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Available actions:\npresss");
        System.out.println("0 - to quit\n");
        System.out.println("1 - to skip forward a song\n");
        System.out.println("2 - to skip backward a song\n");
        System.out.println("3 - replay current song\n");
        System.out.println("4 - list all songs in the playlist\n");
    }
}
