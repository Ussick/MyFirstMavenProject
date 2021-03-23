package org.example.oop.abstractFactory;


public abstract class PhoneFactory {

    public abstract Phone createPhone(String name, int price);

    protected void initialize (String name, int price, Phone phone){
        phone.setName(name);
        phone.setPrice(price);
    }
    public abstract Chehol createChehol();
}
