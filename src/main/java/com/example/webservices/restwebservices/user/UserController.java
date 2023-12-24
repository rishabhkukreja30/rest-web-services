package com.example.webservices.restwebservices.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private UserDaoService userDaoService;

    public UserController(UserDaoService userDaoService) {
        this.userDaoService = userDaoService;
    }

    @GetMapping(path = "/users")
    public List<User> retrieveAllUsers() {
        return userDaoService.findAllUsers();
    }

    @GetMapping(path="users/{id}")
    public User retrieveUser(@PathVariable int id) {
        return userDaoService.findUser(id);
    }
    @PostMapping(path = "/users")
    public void createUser(@RequestBody User user) {
        userDaoService.saveUser(user);
    }
}
