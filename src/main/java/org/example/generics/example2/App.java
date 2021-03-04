package org.example.generics.example2;

import org.example.generics.example2.creator.CarCreatorImpl;
import org.example.generics.example2.creator.ProductCreatorImpl;
import org.example.generics.example2.creator.UserCreatorImpl;
import org.example.generics.example2.model.Car;
import org.example.generics.example2.model.Product;
import org.example.generics.example2.model.User;

public class App {
    public static void main(String[] args) {
        UserCreatorImpl userCreator=new UserCreatorImpl();
        User user=userCreator.apply(123, "Bill");

        ProductCreatorImpl productCreator=new ProductCreatorImpl();
        Product product=productCreator.apply(321,"TV");

        CarCreatorImpl carCreator=new CarCreatorImpl();
        Car car = carCreator.apply(12345678912309L, 1234);

        System.out.println(user);
        System.out.println(product);
        System.out.println(car);
    }
}
