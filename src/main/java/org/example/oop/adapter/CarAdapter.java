package org.example.oop.adapter;

import org.example.oop.adapter.car.Car;

public class CarAdapter implements Car {
    private Bicycle bicycle;

    public CarAdapter(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void drive() {
        bicycle.ride();
    }
}
