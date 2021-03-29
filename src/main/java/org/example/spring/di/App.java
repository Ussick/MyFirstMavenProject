package org.example.spring.di;

public class App {
    public static void main(String[] args) {
        AddressService addressService=new AddressServiceImpl();
        UserService userService=new UserServiceImpl(addressService);
        userService.createUser();
    }
}
