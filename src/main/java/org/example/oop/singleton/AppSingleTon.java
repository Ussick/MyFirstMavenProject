package org.example.oop.singleton;

public class AppSingleTon {
    public static void main(String[] args) {
        Singleton singleton_1=Singleton.getInstance();
        Singleton singleton_2=Singleton.getInstance();

        System.out.println(singleton_1==singleton_2);
    }
}
