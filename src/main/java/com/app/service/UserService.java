package com.app.service;

import com.app.model.User;

import java.util.List;

public interface UserService {

    void register(User user);

    void changePassword(String username, String oldPassword, String newPassword);
    User login(String username, String password);

    List<User> getAllUsers();

    User getUser(String username);
}
