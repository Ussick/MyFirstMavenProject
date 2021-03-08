package org.example.collections.treeSet;

import com.sun.source.util.Trees;

import java.util.Comparator;
import java.util.TreeSet;

public class AppTreeSet {
    public static void main(String[] args) {
        TreeSet<String>treeSet=new TreeSet<>(Comparator.comparing(String::length));
        treeSet.add("AAAAA");
        treeSet.add("WWW");
        treeSet.add("FFFF");
        treeSet.add("Gf");
        treeSet.add("BA");
        System.out.println(treeSet.size());
        treeSet.forEach(System.out::println);

    }
}
