package org.example.homework7.task2;

public class Cake extends Bakery {

    public Cake(int id) {
        super(id);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String toString() {
        return "Cake " + getId();
    }
}
