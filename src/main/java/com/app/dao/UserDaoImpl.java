package com.app.dao;

import com.app.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public List<User> allUsers() {
        Session session = sessionFactory.getCurrentSession();
        Transaction trans = session.beginTransaction();
        Query query = session.createQuery("FROM User");
        trans.commit();
        return (ArrayList<User>) query.list();
    }

    @Override
    public void register(User user) {
        Session session = sessionFactory.getCurrentSession();
        Query<User> query = session.createQuery("FROM User u WHERE u.username = :username", User.class);
        query.setParameter("username", user.getUsername());
        if (query.uniqueResult() != null) {
            throw new IllegalArgumentException("Username already exists. Choose a different username.");
        }
        session.save(user);
    }



    @Override
    public void changePassword(String username, String oldPassword, String newPassword) {
        Session session = sessionFactory.getCurrentSession();
        User user = getUserByUsername(username);
        if (user == null) {
            throw new IllegalArgumentException("User not found.");
        }
        if (!user.getPassword().equals(oldPassword)) {
            throw new IllegalArgumentException("Incorrect old password.");
        }
        if (user.getPassword().equals(newPassword)) {
            throw new IllegalArgumentException("New password must be different from the old password.");
        }
        user.setOld_password(user.getPassword());
        user.setPassword(newPassword);
        session.update(user);
    }




    @Override
    public User getUserByUsername(String username) {
        Session session = sessionFactory.getCurrentSession();
        Query<User> query = session.createQuery("FROM User u WHERE u.username = :username", User.class);
        query.setParameter("username", username);
        return query.uniqueResult();
    }

    @Override
    public User login(String username, String password) {
        User user = getUserByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}
