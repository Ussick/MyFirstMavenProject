package org.example.reflection.annotation;

import org.example.reflection.User;

import java.io.*;
import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.IntStream;

public class Handler<T> {

    private static final String REGEX = "^\\$\\{.*\\}$";
    private static final String FILE_NAME = "src//main//resources/local.properties";

    public void handle(T obj) {
        Class<?> clazz = obj.getClass();
        List<Value> annotation = new ArrayList<>();
        List<Field> declaredFields = Arrays.asList(clazz.getDeclaredFields());
        declaredFields.stream().filter(this::hasValueAnnotation)
                .forEach(field -> initializeValue(field, obj));
    }

    private boolean hasValueAnnotation(Field field) {
        return Objects.nonNull(field.getAnnotation(Value.class));
    }

    private void initializeValue(Field field, T obj) {
        String value = field.getAnnotation(Value.class).value();
        field.setAccessible(true);
        try {
            //field.set(obj,value);
            field.set(obj, convert(value));
        } catch (IllegalAccessException e) {
            throw new RuntimeException();
        }

    }

    private String convert(String value) {
        if (value.matches(REGEX)) {
            return System.getProperty(value.substring(2, value.length() - 1));
        }
        throw new RuntimeException();
    }

    public static void initProperties() {
        Properties properties = new Properties();
        try (FileInputStream propsFile = new FileInputStream(FILE_NAME)) {
            properties.load(propsFile);
            System.setProperties(properties);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
//        Class<User>userClass=User.class;
//        Field lastNameField=userClass.getDeclaredField("lastName");
//
//        Value annotation = lastNameField.getAnnotation(Value.class);
//        System.out.println(annotation.value());
        initProperties();

        Handler<User> userHandler = new Handler<>();
        User user = new User("Jack");
        userHandler.handle(user);
        System.out.println(user);


    }
}
