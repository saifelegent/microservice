package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserServiceImpl implements UserService {


    //fake user list

    List<User> list = List.of(

            new User(1327l, "Saif Ali", "9693255124"),
            new User(1328l, "Nausaba Ali", "9973159807"),
            new User(13215l, "Asin Afrah", "9958114110"),
            new User(13216l, "Asin2 Afrah", "9958114111")
    );

    @Override

    public User getUser(long id) {

        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);

    }
}