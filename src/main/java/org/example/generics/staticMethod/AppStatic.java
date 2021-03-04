package org.example.generics.staticMethod;

import java.util.Arrays;

public class AppStatic {//<T> в классе -не применимо для статических методов
    private static  <T> void print (T []obj){
        //System.out.println(Arrays.toString(obj));
        for (T t:obj){
            System.out.println(t);
        }
    }
    public static void main(String[] args) {
        Integer [] ints={1,2,3};
        String [] strings={"abc", "cde"};
        print(ints);
        print(strings);
    }
}
