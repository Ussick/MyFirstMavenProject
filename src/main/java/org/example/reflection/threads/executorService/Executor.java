package org.example.reflection.threads.executorService;


import java.util.concurrent.*;

public class Executor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(new Task());
        executorService.shutdown();
        }
}
