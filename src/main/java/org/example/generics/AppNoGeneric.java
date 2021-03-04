package org.example.generics;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class AppNoGeneric {
    private String capitalize(String s) {
        return StringUtils.capitalize(s);
    }
    public static void main(String[] args) {
        List <String>strings=new ArrayList();

        //strings.add(new Object());
        strings.add("hello");
        strings.add("one");
        System.out.println(strings.get(1));
        AppNoGeneric app=new AppNoGeneric();
        String o = strings.get(0);
        //if (o instanceof String){
            String capitalize = app.capitalize(o);
            System.out.println(capitalize);
        //}
    }
}
