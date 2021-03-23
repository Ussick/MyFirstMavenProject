package org.example.oop.strategy;


public class ConsoleStrategy implements Strategy{
    @Override
    public void execute(String message) {
        System.out.println(message);
    }
}
