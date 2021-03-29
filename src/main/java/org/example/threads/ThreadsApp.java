package org.example.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadsApp {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> strings=new CopyOnWriteArrayList<>();
        List<String> stringList=new ArrayList<>();
        strings.add("Vasia");
        strings.add("Petya");
        strings.add("Kolia");

        stringList.add("Vasia");
        stringList.add("Petya");
        stringList.add("Kolia");
        stringList.add("Marina");
        stringList.add("Ruslan");

        System.out.println(strings.indexOf("Kolia", 0));
        System.out.println(strings.lastIndexOf("Kolia", 2));
        System.out.println(strings.addIfAbsent("Masha"));
        System.out.println(strings.addIfAbsent("Masha"));
        System.out.println(strings.addAllAbsent(stringList));
    }
}
