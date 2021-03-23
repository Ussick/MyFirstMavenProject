package org.example.oop.solid;

import org.example.App;

import java.util.Calendar;
import java.util.Scanner;

public class AppSolid {
    private Provider provider;
    private Sender sender;

    public AppSolid(Provider provider, Sender sender) {
        this.provider = provider;
        this.sender = sender;
    }

    public void sendMessage(){
        String message=provider.getMessage();

        sender.send(message);
    }

    public static void main(String[] args) {
        //AppSolid app=new AppSolid(new ConsoleProvider(), new ConsoleSender());
        AppSolid app=new AppSolid(new ConsoleProvider(), new FileMessageSender());
        app.sendMessage();
    }
}
