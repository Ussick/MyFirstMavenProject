package org.example.oop.proxy;

public class ProxyWriting implements WriterPr{
    private WriterPr writer=new ConsoleWriterPr();
    private int count=0;

    @Override
    public void write() {
        count++;
        System.out.println("log info "+count);
        writer.write();
    }
}
