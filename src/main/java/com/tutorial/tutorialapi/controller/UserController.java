package com.tutorial.tutorialapi.controller;

import com.tutorial.tutorialapi.Repository.UserRepository;
import com.tutorial.tutorialapi.dao.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@RefreshScope
@RestController
@RequestMapping("/user")
public class UserController {


    @Value("${message:Hello default}")
    private String message;

    @Autowired
    private UserRepository userRepository;
    @GetMapping("/users")
    public Collection<User> getAllUser() {
        return userRepository.findAll();
        /*
        List<String> userList = new ArrayList<>();
        userList.add("Mission Impossible - 2016");
        userList.add("Mission Need to start - 2017");
        userList.add("Mission is started again - 2018");
        return userList;  */
    }

    @GetMapping("/users11")
    public Collection<User> getUserList() {
        return userRepository.findAll();
        /*
        List<String> userList = new ArrayList<>();
        userList.add("Mission Impossible - 2016");
        userList.add("Mission Need to start - 2017");
        userList.add("Mission is started again - 2018");
        return userList;  */
    }
    @PostMapping("/create")
    public String createUser(@Valid String userName) {
        userRepository.save(new User(userName));
        return userName+" Created successfully" + message;
    }

    @GetMapping("/get/{id}")
    public Long createUser(@PathVariable Long id) {
        return id+1;
    }

    @GetMapping("/getByName/{name}")
    public Collection<User> searchByNameUser(@PathVariable String name) {
        return userRepository.findByName(name);
    }
}
