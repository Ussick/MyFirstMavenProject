package org.example.oop.strategy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileStrategy implements Strategy{
    @Override
    public void execute(String message) {
            try (FileWriter fileWriter=new FileWriter("log.txt")){
                File file=new File("log.txt");
                file.setWritable(true);
                    fileWriter.write(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
