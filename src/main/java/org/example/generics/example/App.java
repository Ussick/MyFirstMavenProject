package org.example.generics.example;

public class App {

    public static void main(String[] args) {
        GenerycType generycType=new GenerycType("Object");
        Object item = generycType.getItem();
        GenerycType<String> stringGenerycType=new GenerycType<>("String");
        String stringItem = stringGenerycType.getItem();

        GenerycType<Integer> integerGenerycType=new GenerycType<>(5);

        Integer integer = integerGenerycType.getItem();
    }
}
