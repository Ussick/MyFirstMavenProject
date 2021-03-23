package org.example.oop.inheritance;

public class AppInherit {

    private static void handle (Flyable item){
        item.fly();
    }

    private static void eat (Bird bird){
        bird.eat();
    }

    public static void main(String[] args) {
//        Apple apple=new Apple();
//        apple.getColor();
//        apple.getName();
//        apple.getType();

        Bird bird1=new Bird();
        Bird bird2=new Bird();
        Airplane airplane=new Airplane();
        Flyable.create();
        airplane.methods();
        handle(bird1);
        handle(bird2);
        if(true){
            handle(airplane);
        }
    }
}
