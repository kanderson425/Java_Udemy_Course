package com.kyleanderson;

import java.io.IOException;
import java.net.ServerSocket;

public class Main {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
