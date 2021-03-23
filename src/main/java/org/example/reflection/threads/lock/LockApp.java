package org.example.reflection.threads.lock;

import java.util.concurrent.locks.ReentrantLock;

public class LockApp {
    private ReentrantLock lock=new ReentrantLock();
    private int count=0;

    public void increment(){
        if (lock.isLocked()){
            System.out.println(Thread.currentThread().getName()+ " Skip this method");
            return;
        }
        lock.lock();
        try {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public static void main(String[] args) {
        LockApp lockApp= new LockApp();
        Runnable runnable=()-> lockApp.increment();
        Runnable runnable2=()->lockApp.increment();

        Thread thread1=new Thread(runnable);
        thread1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread2=new Thread(runnable2);

        thread2.start();
    }
}
