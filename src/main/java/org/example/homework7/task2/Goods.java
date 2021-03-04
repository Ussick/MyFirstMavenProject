package org.example.homework7.task2;

public class Goods {
    private int id;

    public Goods(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Good " + getId();
    }
}
