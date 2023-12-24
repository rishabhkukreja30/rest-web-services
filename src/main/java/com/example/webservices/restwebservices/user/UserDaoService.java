package com.example.webservices.restwebservices.user;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserDaoService {
    private  static List<User> users = new ArrayList<>();
    private  static int userCount = 0;

    static {
        users.add(new User(++userCount,"Rishabh", LocalDate.now().minusYears(22)));
        users.add(new User(++userCount, "Tom", LocalDate.now().minusYears(40)));
        users.add(new User(++userCount, "Danny", LocalDate.now().minusYears(27)));
    }

    public List<User> findAllUsers() {
        return users;
    }

    public User findUser(int id) {
        return users.stream().filter(user -> user.getId() == id).findFirst().get();
    }

    public User saveUser(User user) {
        user.setId(++userCount);
        users.add(user);
        return user;
    }
}
