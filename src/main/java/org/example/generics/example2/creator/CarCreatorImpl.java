package org.example.generics.example2.creator;

import org.example.generics.example2.model.Car;

public class CarCreatorImpl implements  Creator <Car, Long, Integer>{
    @Override
    public Car apply(Long serialNumber, Integer number) {
        return new Car(serialNumber,number);
    }
}
