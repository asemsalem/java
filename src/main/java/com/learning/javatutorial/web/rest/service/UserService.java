package com.learning.javatutorial.web.rest.service;

import com.learning.javatutorial.web.rest.api.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<User>();

        User user1 = new User(1, "John", 32, "assem@gmail.com");
        User user2 = new User(2, "John", 32, "assem@gmail.com");
        User user3 = new User(3, "John", 32, "assem@gmail.com");
        User user4 = new User(4, "John", 32, "assem@gmail.com");
        User user5 = new User(5, "John", 32, "assem@gmail.com");

        userList.addAll(Arrays.asList(user1, user2, user3, user4, user5));
    }

    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user : userList) {
            if (id == user.getId()) {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
