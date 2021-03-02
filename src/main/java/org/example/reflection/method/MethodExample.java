package org.example.reflection.method;

import org.example.reflection.User;

import java.lang.reflect.Method;

public class MethodExample {
    public static void main(String[] args) throws Exception {
        Method setName = User.class.getMethod("setName", String.class);
        User user = new User();
        setName.invoke(user, "Jack");
        System.out.println(user);
    }
}
