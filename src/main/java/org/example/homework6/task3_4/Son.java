package org.example.homework6.task3_4;


import java.util.Arrays;

public class Son extends Papa {
    public Son(String name) {
        super(name);
    }

    @Init
    private void init() {
        System.out.println("in method init with @Init " + Son.class.getSimpleName());
    }

    @Override
    public String toString() {
        return "Son{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Class<Son> sonClass = Son.class;
        System.out.println(sonClass.getAnnotations().length);//1
        Arrays.asList(sonClass.getAnnotations()).stream()
                .forEach(annotation -> System.out.println(annotation.annotationType().getSimpleName()));
    }
}
