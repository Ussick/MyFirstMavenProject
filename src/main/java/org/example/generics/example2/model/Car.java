package org.example.generics.example2.model;

public class Car {
    private long engineSerialNumber;
    private int serialnumber;

    public Car(long engineSerialNumber, int serialnumber) {
        this.engineSerialNumber = engineSerialNumber;
        this.serialnumber = serialnumber;
    }

    public long getEngineSerialNumber() {
        return engineSerialNumber;
    }

    public int getSerialnumber() {
        return serialnumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineSerialNumber=" + engineSerialNumber +
                ", serialnumber=" + serialnumber +
                '}';
    }
}
