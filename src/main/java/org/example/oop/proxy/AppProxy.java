package org.example.oop.proxy;

public class AppProxy {
    public static void main(String[] args) {
        WriterPr writer=new ProxyWriting();
        writer.write();
        writer.write();
    }
}
