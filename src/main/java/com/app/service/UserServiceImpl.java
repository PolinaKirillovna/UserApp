package com.app.service;

import com.app.dao.UserDao;
import org.springframework.transaction.annotation.Transactional;
import com.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void register(User user) {
        userDao.register(user);
    }

    @Override
    @Transactional
    public void changePassword(String username, String oldPassword, String newPassword) {
        userDao.changePassword(username, oldPassword, newPassword);
    }

    @Override
    @Transactional
    public User login(String username, String password) {
        return userDao.login(username, password);
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    @Transactional
    public User getUser(String username) {
        return null;
    }
}
