package com.kadelcode.user.service;

import com.kadelcode.user.model.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    private final UserService userService = new UserService();

    @Test
    void shouldReturnThreeUsers() {

        List<User> users = userService.getUsers();

        assertEquals(3, users.size());
    }

    @Test
    void firstUserShouldBeAlice() {

        User user = userService.getUsers().getFirst();

        assertEquals("Alice Johnson", user.name());
    }
}
