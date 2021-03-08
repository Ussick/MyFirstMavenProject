package org.example.collections.treeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class AppMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> integerStringTreeMap=new TreeMap<>();
        integerStringTreeMap.put(1, "one");
        integerStringTreeMap.put(5, "five");
        integerStringTreeMap.put(3, "three");
        integerStringTreeMap.put(2, "two");
        System.out.println(integerStringTreeMap);

        System.out.println(integerStringTreeMap.lastEntry().getValue());
        integerStringTreeMap.entrySet().forEach(System.out::println);
        System.out.println("!!!!!!!!!!!!!!!!!");
        integerStringTreeMap.descendingMap().entrySet().forEach(System.out::println);
    }
}
