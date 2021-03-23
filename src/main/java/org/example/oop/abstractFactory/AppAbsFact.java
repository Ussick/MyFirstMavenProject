package org.example.oop.abstractFactory;

public class AppAbsFact {

    public static void main(String[] args) {
        PhoneFactory factory=new SamsungFactory();
        Phone samsung=factory.createPhone("Samsung", 100);
        Chehol cheholSamsung=factory.createChehol();
        System.out.println(samsung);
        System.out.println(cheholSamsung);
    }
}
