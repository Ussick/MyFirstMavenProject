package org.example.generics.notStaticMethod;

public class AppNotStatic <U>{
    private U element;

    public <T> void print(T item){
        System.out.println(item.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        new AppNotStatic().print("");
        new AppNotStatic().print(111);
        new AppNotStatic<String>().print(111.0);
    }
}
