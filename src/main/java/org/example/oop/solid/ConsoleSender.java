package org.example.oop.solid;

public class ConsoleSender implements Sender{
    @Override
    public void send(String str) {
        System.out.println(str);
    }
}
