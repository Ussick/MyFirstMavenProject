package org.example.reflection.constructor;

import org.example.reflection.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorExample {
    public static void main(String[] args) throws Exception {
        Class<User> userClass = User.class;

        Constructor<?>[] constructors = User.class.getConstructors();
        System.out.println("public constructors " + constructors.length);
        System.out.println("all constructors " + User.class.getDeclaredConstructors().length);

        User user1 = userClass.getConstructor().newInstance();
        System.out.println(user1);
        User user2 = userClass.getConstructor(String.class).newInstance("User 2");
        System.out.println(user2);

    }
}
