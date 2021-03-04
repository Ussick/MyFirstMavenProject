package org.example.generics.example;

public class GenerycType <T>{
    private int id;
    private final T item;

    public GenerycType(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
