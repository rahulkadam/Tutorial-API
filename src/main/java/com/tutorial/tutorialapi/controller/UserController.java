package com.tutorial.tutorialapi.controller;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @GetMapping("/users")
    public List<String> getAllUser() {
        List<String> userList = new ArrayList<>();
        userList.add("Mission Impossible - 2016");
        userList.add("Mission Need to start - 2017");
        userList.add("Mission is started again - 2018");
        return userList;
    }

    @PostMapping("/create")
    public String createUser(@Valid String userName) {
        return userName+" Created successfully";
    }

    @GetMapping("/get/{id}")
    public Long createUser(@PathVariable Long id) {
        return id+1;
    }
}
