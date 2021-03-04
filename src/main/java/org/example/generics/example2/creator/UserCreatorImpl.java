package org.example.generics.example2.creator;

import org.example.generics.example2.model.User;

public class UserCreatorImpl extends EntityCreatorImpl <User>{
    @Override
    public User apply(Integer id, String name) {
        return new User(id, name);
    }
}
