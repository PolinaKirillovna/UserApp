package com.app.dao;

import com.app.model.User;

import java.util.List;

public interface UserDao {
    List<User> allUsers();
    void register(User user);
    void changePassword(String username, String oldPassword, String newPassword);
    User getUserByUsername(String username);

    User login(String username, String password);
}
