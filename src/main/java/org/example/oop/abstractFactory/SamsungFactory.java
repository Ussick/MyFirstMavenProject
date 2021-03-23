package org.example.oop.abstractFactory;

public class SamsungFactory extends PhoneFactory{
    @Override
    public Phone createPhone(String name, int price) {
        Samsung samsung=new Samsung();
        initialize(name, price, samsung);
        return samsung;
    }

    @Override
    public Chehol createChehol() {
        Chehol chehol=new Chehol();
        chehol.setName("Samsung Chechol");
        return chehol;
    }
}
