package com.kyleanderson;

import java.util.ArrayList;

public class Album {
    private String name;
    private ArrayList<Song> albumSongList;

    public String getName() {
        return name;
    }

    public ArrayList<Song> getAlbumSongList() {
        return albumSongList;
    }

    public Album(String name) {
        this.name = name;
        this.albumSongList = new ArrayList<Song>();
    }

    public boolean addSong(String songName) {
        if(findSong(songName) == null) {
            this.albumSongList.add(new Song(name));
            return true;
        }
        return false;
    }

    private Song findSong(String songName) {
        for(int i = 0; i<albumSongList.size(); i++) {
            Song checkedSong = this.albumSongList.get(i);
            if(checkedSong.getName().equals(songName)) {
                return checkedSong;
            }
        }
        return null;
    }




}
