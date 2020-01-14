package com.kyleanderson;

import static com.kyleanderson.ThreadColor.ANSI_PURPLE;
import static com.kyleanderson.ThreadColor.ANSI_GREEN;
import static com.kyleanderson.ThreadColor.ANSI_RED;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+"Hello from the main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN+"Hello from the anonymous class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class' implementation of run()");
            }
        });

        myRunnableThread.start();

        System.out.println(ANSI_PURPLE+"Hello again from the main thread.");

//        anotherThread.start(); We cannot re-use the same instance here. We'd need to create a new instance



    }
}
