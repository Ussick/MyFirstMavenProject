package org.example.homework3;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class AppH3 {
    private static List<String> getList() {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("Three");
        list.add("four");
        list.add("FIVE");
        list.add("Six");
        list.add("seven");
        return list;
    }

    public static void main(String[] args) {
        List<String> strings = getList();

        strings.sort((a, b) -> {
            if (a.length()==b.length()){
                return a.toLowerCase().compareTo(b.toLowerCase());
            }
            else {
                return a.length()-b.length();
            }
        } ); //сюда написать компаратор (любда)

        System.out.println(strings);

        System.out.println("************");

        strings.forEach((a)-> System.out.printf(a.toUpperCase()+" "));

        System.out.println("\n************");

        strings.forEach((a)-> System.out.printf(StringUtils.capitalize(a)+" "));

    }

}
