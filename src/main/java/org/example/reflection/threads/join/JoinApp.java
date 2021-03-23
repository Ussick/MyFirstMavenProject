package org.example.reflection.threads.join;

public class JoinApp {
    public static void main(String[] args) {
        Runnable worker= () -> {
            try {
                Thread.sleep(2000);
                System.out.println("Hello from worker");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread thread=new Thread(worker);
        thread.start();
        try {
            Thread.sleep(1000);
            System.out.println("Main thread");
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("finish  of main");

    }
}
