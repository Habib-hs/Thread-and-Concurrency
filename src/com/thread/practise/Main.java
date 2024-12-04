package com.thread.practise;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args){
         Thread.currentThread().getThreadGroup().getParent().list();


        Runnable target = new Runnable() {
            @Override
            public void run() {
                for (int i =0; i<10; i++){
                    System.out.println("Current Thread is : "+  Thread.currentThread().getName());
                    try {
                        Thread.sleep(10000); // Sleep for 1 seconds
                    } catch (InterruptedException e) {
                        System.out.println("Main thread interrupted during sleep!");
                    }
                }
            }
        };

        Thread th = new Thread(target, "habib");
        th.start();



        for (int i =0; i<10; i++){
            System.out.println("Thread is : "+  Thread.currentThread().getName());
            try {
                Thread.sleep(10000); // Sleep for 1 seconds
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted during sleep!");
            }
        }

//jps -l
// jstack pid
    }
}
