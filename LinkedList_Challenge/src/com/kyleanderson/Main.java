package com.kyleanderson;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> playList = new LinkedList<String>();
        Playlist.addSong("Dark Side of the Moon", "Time", 4.35);
        Playlist.printPlaylist(playList);

    }


}
