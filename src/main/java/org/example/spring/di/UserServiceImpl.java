package org.example.spring.di;

public class UserServiceImpl implements UserService{
    AddressService addressService;

    public UserServiceImpl(AddressService addressService) {
        this.addressService = addressService;
    }

    @Override
    public void createUser() {
        System.out.println("User created");
    }
}
