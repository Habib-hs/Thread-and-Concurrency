package com.thread.practise;

import static java.lang.Thread.sleep;

class Task implements Runnable {  // No 'public' here
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println(i + " state is " + Thread.currentThread().getState());
            try {
                Thread.sleep(10000); // Sleep for 1 seconds
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted during sleep!");
            }
        }
    }
}

public class LifeCycle {  // File name must be LifeCycle.java
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new Task());
        t.start();

        sleep(100);
        System.out.println("state is " + t.getState());

    }
}


//