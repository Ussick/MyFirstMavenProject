package org.example.oop.solid;

import java.io.FileWriter;
import java.io.IOException;

public class FileMessageSender implements Sender{
    @Override
    public void send(String str) {
        try (FileWriter fileWriter=new FileWriter("log.txt")){
            fileWriter.write(str);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
