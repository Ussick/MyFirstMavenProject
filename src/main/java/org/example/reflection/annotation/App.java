package org.example.reflection.annotation;

import org.example.reflection.User;

import java.lang.reflect.Array;

public class App {
    public static void main(String[] args) {
        User user = new User("Jack");
        System.out.println(user);

        int i = (int) Array.get(new int[]{1, 2, 3}, 2);
        System.out.println(i);
    }
}
