package org.example.oop.polimorphism;

public class MailSender implements Sender{
    @Override
    public void send(String str) {
        System.out.println("Mail is sent");
    }
}
