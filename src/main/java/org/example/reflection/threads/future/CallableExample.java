package org.example.reflection.threads.future;

import java.util.concurrent.Callable;

public class CallableExample implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(1000L); //1 секунды пауза
        return Thread.currentThread().getName();
    }
}
