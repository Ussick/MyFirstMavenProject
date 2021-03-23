package org.example.oop.adapter;

import org.example.oop.adapter.car.Audi;

public class AppAdapter {
    public static void main(String[] args) {
        Driver driver=new Driver(new Audi());

        driver.drive();

        driver.setTransport(new CarAdapter(new Bicycle()));

        driver.drive();
    }
}
