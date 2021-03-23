package org.example.oop.factory;

public class AppFact {

    public static void main(String[] args) {
        ProductFactory tvFactory=new TvFactory();
        ProductFactory phoneFactory=new PhoneFactory();
        Product tv= tvFactory.createProduct("tv 1", 10);
        Product phone=phoneFactory.createProduct("phone 1", 20);

        System.out.println(phone);
        System.out.println(tv);
    }
}
