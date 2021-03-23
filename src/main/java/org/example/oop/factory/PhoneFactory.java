package org.example.oop.factory;

public class PhoneFactory extends ProductFactory{
    @Override
    public Product createProduct(String name, int price) {
        Phone phone=new Phone();
        initialize(name, price, phone);
        return phone;
    }
}
