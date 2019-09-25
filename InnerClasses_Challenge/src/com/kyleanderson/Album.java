package com.kyleanderson;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

//    public boolean addSong(String title, double duration) {
//        if (findSong(title) == null) {
//            this.songs.add(new Song(title, duration));
//            return true;
//        }
//        return false;
//    }

//    private Song findSong(String title) {
//        for(Song checkedSong: this.songs) {
//            if(checkedSong.getTitle().equals(title)) {
//                return checkedSong;
//            }
//        }
//        return null;
//    }

    public boolean addToPlaylist(int trackNumber, List<Song> playlist) {
        int index = trackNumber -1;
        if((index >= 0) && (index <= this.songs.size())) {
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, List<Song> playlist) {
        Song checkedSong = SongList.findSong(title);
        if(checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    private class SongList {
        private String title;
        private double duration;
        private ArrayList<Song> songs;

        public SongList(String title, double duration) {
            this.title = title;
            this.duration = duration;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return this.title + ": " + this.duration;
        }

        public boolean addSong(String title, double duration) {
            if (findSong(title) == null) {
                this.songs.add(new Song(title, duration));
                return true;
            }
            return false;
        }

        public Song findSong(String title) {
            for(Song checkedSong: this.songs) {
                if(checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }


    }
}
