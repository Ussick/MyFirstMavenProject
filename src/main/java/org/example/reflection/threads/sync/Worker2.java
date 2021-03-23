package org.example.reflection.threads.sync;

public class Worker2 implements Runnable{
    private SyncApp syncApp;

    public Worker2(SyncApp syncApp) {
        this.syncApp = syncApp;
    }

    @Override
    public void run() {
        syncApp.method2();
    }
}
