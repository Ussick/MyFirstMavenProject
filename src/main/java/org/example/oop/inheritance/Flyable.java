package org.example.oop.inheritance;

public interface Flyable {
    void fly();

    default void methods(){
    }

    static void create(){
    }

    private String maker(){
        return "";
    }
}
