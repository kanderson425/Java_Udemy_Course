package com.kyleanderson;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> playList = new LinkedList<String>();
    }

    public static void printMenu() {
        System.out.println("Available actions:\npresss");
        System.out.println("0 - to quit\n");
        System.out.println("1 - to skip forward a song\n");
        System.out.println("2 - to skip backward a song\n");
        System.out.printf("3 - replay current song\n");
        System.out.println("4 - list all songs in the playlist\n");
    }
}
