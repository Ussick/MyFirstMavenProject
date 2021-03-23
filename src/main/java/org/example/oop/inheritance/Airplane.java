package org.example.oop.inheritance;

import javax.sound.midi.Soundbank;

public class Airplane implements Flyable{
    @Override
    public void fly() {
        System.out.println("Flying...");;
    }
    public void fillFuel(){
        System.out.println("Fill fuel");
    }
}
