package com.app.service;

import com.app.dao.UserDao;
import com.app.dao.UserDaoImpl;
import com.app.model.User;

import java.util.List;

public class UserServiceImpl implements UserService{
    private UserDao userDao = new UserDaoImpl();

    @Override
    public void register(User user) {

    }

    @Override
    public void changePassword(String username, String oldPassword, String newPassword) {

    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUser(String username) {
        return null;
    }
}
