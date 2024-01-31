package com.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private String password;
    private String email;
    private String old_password;

    protected User() {
    }

    protected User(String username, String password, String email, String old_password){
        this.username = username;
        this.password = password;
        this.email = email;
        this.old_password = old_password;
    }
}
