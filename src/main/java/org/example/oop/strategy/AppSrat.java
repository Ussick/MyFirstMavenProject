package org.example.oop.strategy;

public class AppSrat {

    public static void main(String[] args) {
        Context context=new Context();
        context.execute("message", "console");
        context.execute("message22", "file");
        context.execute("message3", "email");
    }
}
