package org.example.oop.abstractFactory;

public class IphoneFactory extends PhoneFactory{
    @Override
    public Phone createPhone(String name, int price) {
        Iphone iphone=new Iphone();
        initialize(name, price, iphone);
        return iphone;
    }
    @Override
    public Chehol createChehol() {
        Chehol chehol=new Chehol();
        chehol.setName("Iphone Chechol");
        return chehol;
    }
}
