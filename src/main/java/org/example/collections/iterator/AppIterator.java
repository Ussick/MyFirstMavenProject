package org.example.collections.iterator;

import java.util.*;

public class AppIterator {

    private static TreeSet<String>  isAdd(TreeSet<String>a, String b) {
        a.add(b.toUpperCase());
        return a;
    }

    private static TreeSet<String>  combiner(TreeSet<String>a, TreeSet<String> b) {
        a.addAll(b);
        return a;
    }

    public static void main(String[] args) {
        Set<String>set=Set.of("a","b","c");
        System.out.println("for");
        for (String s:set){
            System.out.println(s);
        }

        System.out.println("Iterator");
        Iterator<String>iterator= set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Iterator for each");
        set.iterator().forEachRemaining(System.out::println);
        System.out.println("Iterator with stream");
        set.stream().forEach(System.out::println);

        List<String>list=new ArrayList<>();
        list.add("a");
        list.add("b");
        //list.stream().collect(TreeSet::new, (TreeSet<String>a, String b)->a.add(b.toUpperCase()), TreeSet::addAll);
        System.out.println(list.stream().collect(TreeSet::new, AppIterator::isAdd, AppIterator::combiner));
    }
}
