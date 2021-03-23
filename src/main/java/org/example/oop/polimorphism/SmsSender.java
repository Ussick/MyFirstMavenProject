package org.example.oop.polimorphism;

public class SmsSender implements Sender{
    @Override
    public void send(String str) {
        System.out.println("Sms is sent");
    }
}
