package com.kyleanderson;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from another thread.");
    }
}
