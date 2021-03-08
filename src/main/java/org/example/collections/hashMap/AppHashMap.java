package org.example.collections.hashMap;

import java.util.HashMap;
import java.util.Map;

public class AppHashMap {
    public static void main(String[] args) {
//        Map<Integer, String> map=new HashMap<>();
        Integer tw=36;
        System.out.println("Hashcode: "+tw.hashCode());
        System.out.println("Index: "+(tw&3));
        //map.put(tw, "tw");
    }
}
