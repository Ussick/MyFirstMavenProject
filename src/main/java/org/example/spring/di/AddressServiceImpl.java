package org.example.spring.di;

public class AddressServiceImpl implements AddressService{

    @Override
    public void createAddress() {
        System.out.println("Address created");
    }
}
