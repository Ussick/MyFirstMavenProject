package org.example.reflection.threads.sync;

public class SyncApp {
    public synchronized void method1(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("method1");

    }
    public synchronized void method2(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("method2");
    }

    public static void main(String[] args) {
        SyncApp syncApp=new SyncApp();
        Thread thread1=new Thread(new Worker(syncApp));
        Thread thread2=new Thread(new Worker2(syncApp));
        thread1.start();
        thread2.start();
    }
}
