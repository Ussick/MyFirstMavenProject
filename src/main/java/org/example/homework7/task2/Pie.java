package org.example.homework7.task2;

public class Pie extends Bakery{

    public Pie(int id) {
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
        return "Pie " + getId();
    }
}
