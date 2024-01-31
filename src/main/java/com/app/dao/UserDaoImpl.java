package com.app.dao;

import com.app.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class UserDaoImpl implements UserDao{
    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<Integer, User> users = new HashMap<>();
    @Override
    public List<User> allUsers() {
        return new ArrayList<>(users.values());
    }

    @Override
    public void register(User user) {

    }

    @Override
    public void changePassword(String username, String oldPassword, String newPassword) {

    }

    @Override
    public User getUserByUsername(String username) {
        return null;
    }
}
