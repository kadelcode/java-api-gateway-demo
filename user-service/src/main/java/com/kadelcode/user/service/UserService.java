package com.kadelcode.user.service;

import com.kadelcode.user.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public List<User> getUsers() {

        return List.of(
            new User(
                1L,
                "Alice Johnson",
                "alice@example.com"
            ),
            new User(
                2L,
                "Bob Smith",
                "bob@example.com"
            ),
            new User(
                3L,
                "Charlie Brown",
                "charlie@example.com"
            )
        );
    }
}
