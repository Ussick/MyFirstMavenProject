package org.example.oop.decorator;

public class AppDecorator {
    public static void main(String[] args) {
//        Writer writer=new ConsoleWriter();
//        writer.write("message: \"Hello World\"");
        Writer writer=new FormatConsoleDecorator(new ConsoleWriter());
        //Writer writer=new FormatConsoleDecorator(new FormatConsoleDecorator(new ConsoleWriter()));
        writer.write("message: \"Hello World\"");

    }
}
