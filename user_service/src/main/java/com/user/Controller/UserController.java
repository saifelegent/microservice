package com.user.Controller;

import com.user.entity.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")

public class UserController {

    @Autowired
    private UserService userservice;

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") long userId) {
        return this.userservice.getUser(userId);
    }


}
