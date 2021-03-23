package org.example.oop.inheritance;

public class Bird implements Flyable{
    @Override
    public void fly(){
        System.out.println("Flying");
    }

    public void eat(){
        System.out.println("Eating");
    }
}
