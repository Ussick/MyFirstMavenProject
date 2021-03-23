package org.example.reflection.threads.interrupt;

public class InterruptApp {
    public static void main(String[] args) {
        Runnable worker= () -> {
            try {
                int i=1/0;
                Thread.sleep(6000);
                System.out.println("Hello from worker");
            } catch (InterruptedException e) {
                System.out.println("was interrupted");;
            }
        };
        Thread thread=new Thread(worker);
        thread.start();
        try {
            Thread.sleep(1000);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
