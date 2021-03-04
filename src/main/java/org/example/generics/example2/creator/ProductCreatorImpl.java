package org.example.generics.example2.creator;

import org.example.generics.example2.model.Product;

public class ProductCreatorImpl extends EntityCreatorImpl <Product>{
    @Override
    public Product apply(Integer id, String name) {
        return new Product(id, name);
    }
}
