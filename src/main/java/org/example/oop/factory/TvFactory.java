package org.example.oop.factory;

public class TvFactory extends ProductFactory{
    @Override
    public Product createProduct(String name, int price) {
        Tv tv=new Tv();
        initialize(name, price, tv);
        return tv;
    }
}
