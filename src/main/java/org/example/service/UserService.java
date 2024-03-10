package org.example.service;

import org.example.User;

public class UserService<T extends User> {
    T user;

    public UserService(T user) {
        this.user = user;
    }
    public T getGroup(){
        return user;
    }
}
