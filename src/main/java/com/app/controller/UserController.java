package com.app.controller;

import com.app.model.User;
import com.app.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/users")
    public List<User> allUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/login")
    public String showLogin() {
        return "login";
    }

    @PostMapping("/loginProcess")
    public ResponseEntity<?> loginProcess(@RequestParam("username") String username,
                                          @RequestParam("password") String password) {
        User user = userService.login(username, password);
        if (user != null) {
            return ResponseEntity.ok().body(user);
        } else {
            return ResponseEntity.badRequest().body("Username or Password is wrong!!");
        }
    }

    @GetMapping("/register")
    public String showRegister() {
        return "register";
    }

    @PostMapping("/registerProcess")
    public ResponseEntity<String> registerProcess(@RequestParam("username") String username,
                                                  @RequestParam("password") String password,
                                                  @RequestParam("email") String email) {
        User newUser = new User(username, password, email);
        userService.register(newUser);
        return ResponseEntity.ok("Registration successful! Please login.");
    }

    @GetMapping("/changePassword")
    public String showChangePassword() {
        return "changePassword";
    }

    @PostMapping("/changePassword")
    public ResponseEntity<?> changePassword(@RequestParam("username") String username,
                                            @RequestParam("oldPassword") String oldPassword,
                                            @RequestParam("newPassword") String newPassword) {
        userService.changePassword(username, oldPassword, newPassword);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/lk")
    public String showLk() {
        return "lk";
    }
}
