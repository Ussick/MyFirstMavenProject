package org.example.homework7.task2;

public class Packer {
    public void repackage(Box<? super Food> to, Box<? extends Food> from) {
        to.put(from.get());
    }

    public static void main(String[] args) {
        Packer packer = new Packer();

        Box<Food> foodBox = new Box<>();
        Cake cake = new Cake(1);
        Box<Cake> cakeBox = new Box<>();
        cakeBox.put(cake);
        packer.repackage(foodBox, cakeBox);
        System.out.println(foodBox.get());

        Bakery bakery = new Bakery(1);
        Box<Bakery> bakeryBox = new Box<>();
        bakeryBox.put(bakery);
        packer.repackage(foodBox, bakeryBox);
        System.out.println(foodBox.get());

        Box<Goods> goodsBox = new Box<>();
        packer.repackage(goodsBox, cakeBox);
        System.out.println(goodsBox.get());
    }
}
