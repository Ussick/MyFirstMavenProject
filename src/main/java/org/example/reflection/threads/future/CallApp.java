package org.example.reflection.threads.future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallApp {
    public static void main(String[] args) throws Exception {
       ExecutorService executor = Executors.newFixedThreadPool(4);

       List<Future<String>> futures = new ArrayList<>();

       for (int i = 0; i < 3; i++) {
            futures.add(executor.submit(new CallableExample()));
             }
        for (Future<String> future : futures) {
             System.out.println(future.get());
             }
        }
}
