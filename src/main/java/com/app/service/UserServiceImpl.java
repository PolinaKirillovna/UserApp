package com.app.service;

import com.app.dao.UserDao;
import com.app.exceptions.IncorrectLoginException;
import com.app.exceptions.PasswordMismatchException;
import com.app.exceptions.UsernameAlreadyExistsException;
import org.springframework.transaction.annotation.Transactional;
import com.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        Optional<User> existingUser = Optional.ofNullable(userDao.getUserByUsername(user.getUsername()));
        if (existingUser.isPresent()) {
            throw new UsernameAlreadyExistsException("Username already exists");
        }
        userDao.register(user);
    }


    @Override
    @Transactional
    public void changePassword(String username, String oldPassword, String newPassword) {
        User user = userDao.getUserByUsername(username);
        if (user == null || !user.getPassword().equals(oldPassword)) {
            throw new PasswordMismatchException("Old password does not match");
        }
        userDao.changePassword(username, oldPassword, newPassword);
    }




    @Override
    @Transactional
    public User login(String username, String password) {
        User user = userDao.login(username, password);
        if (user == null || !user.getPassword().equals(password)) {
            throw new IncorrectLoginException("Incorrect login credentials");
        }
        return user;
    }


    @Override
    @Transactional
    public List<User> getAllUsers() {

        return userDao.allUsers();
    }

    @Override
    @Transactional
    public User getUser(String username) {

        return userDao.getUserByUsername(username);
    }
}
