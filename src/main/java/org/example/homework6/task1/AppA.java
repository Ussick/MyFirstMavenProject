package org.example.homework6.task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class AppA {
    public static void main(String[] args) throws Exception {
        Class<A> aClass = A.class;
        Constructor<A> constructor = aClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        A a = constructor.newInstance();
        System.out.println(a);
        Field[] field = aClass.getDeclaredFields();
        for (Field f : field) {
            System.out.println(f.getType() + " " + f.getName() + " " + Modifier.toString(f.getModifiers()));
            f.setAccessible(true);
        }
        field[0].set(a, "333");
        field[1].set(a, "B");
        System.out.println(a);
        for (Field f : field) {
            f.setAccessible(false);
        }
    }
}
