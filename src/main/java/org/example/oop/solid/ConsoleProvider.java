package org.example.oop.solid;

import java.util.Scanner;

public class ConsoleProvider implements Provider{
    @Override
    public String getMessage() {
        try (Scanner scanner=new Scanner(System.in)){
            return scanner.nextLine();
        }
    }
}
