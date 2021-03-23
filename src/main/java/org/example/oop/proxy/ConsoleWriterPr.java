package org.example.oop.proxy;

public class ConsoleWriterPr implements WriterPr{
    @Override
    public void write() {
        System.out.println("Writing...");
    }
}
