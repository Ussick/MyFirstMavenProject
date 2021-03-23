package org.example.oop.builder;

public class AppBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("");
        String s = stringBuilder.append("1").append("3").append(2).toString();
        System.out.println(s);

        User empty=User.builder().build();
        User user= User.builder().name("V").lastName("R").age(11).build();
        System.out.println(empty);
        System.out.println(user);

    }
}

