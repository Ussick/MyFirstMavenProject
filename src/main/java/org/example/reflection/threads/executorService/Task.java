package org.example.reflection.threads.executorService;

public class Task implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello!");
    }
}
