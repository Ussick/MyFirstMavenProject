package org.example.oop.delegate;

import java.util.List;

public class AppDelegate {
    public static void main(String[] args) {
        Manager manager=new Manager(List.of(new Worker(), new Worker(), new Worker()));
        manager.work();
    }
}
