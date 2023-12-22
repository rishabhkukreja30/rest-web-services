package com.example.webservices.restwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserDaoService {
    private  static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1,"Rishabh", LocalDate.now().minusYears(22)));
        users.add(new User(2, "Tom", LocalDate.now().minusYears(40)));
        users.add(new User(3, "Danny", LocalDate.now().minusYears(27)));
    }

    public List<User> findAllUsers() {
        return users;
    }
}
