package com.kyleanderson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

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

}
