package com.kyleanderson;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello from the main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println("Hello from the anonymous class thread");
            }
        }.start();

        System.out.println("Hello again from the main thread.");

//        anotherThread.start(); We cannot re-use the same instance here. We'd need to create a new instance



    }
}
