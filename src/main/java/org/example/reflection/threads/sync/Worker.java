package org.example.reflection.threads.sync;

public class Worker implements Runnable{
    private SyncApp syncApp;

    public Worker(SyncApp syncApp) {
        this.syncApp = syncApp;
    }

    @Override
    public void run() {
        syncApp.method1();
    }
}
