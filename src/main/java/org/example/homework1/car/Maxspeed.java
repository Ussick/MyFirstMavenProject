package org.example.homework1.car;

public class Maxspeed {
    private String unit;
    private int value;

    public Maxspeed() {
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Maxspeed{" +
                "unit='" + unit + '\'' +
                ", value=" + value +
                '}';
    }
}
