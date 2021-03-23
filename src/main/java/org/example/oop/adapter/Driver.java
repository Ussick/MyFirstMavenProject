package org.example.oop.adapter;

import org.example.oop.adapter.car.Car;

public class Driver {
    private Car transport;

    public Driver(Car car) {
        this.transport = car;
    }

    public void setTransport(Car transport) {
        this.transport = transport;
    }


    public void drive(){
        transport.drive();
    }
}
