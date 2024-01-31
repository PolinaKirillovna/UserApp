package com.app.controller;

import com.app.model.User;
import com.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
    private UserService userService;
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ModelAndView allUsers(){
        List<User> users = userService.getAllUsers();
        ModelAndView mav = new ModelAndView();
        mav.setViewName("users");
        mav.addObject("usersList", users);
        return mav;
    }
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView showLogin() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        return mav;
    }

    @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
    public ModelAndView loginProcess(@RequestParam("username") String username,
                                     @RequestParam("password") String password) {
        ModelAndView mav = new ModelAndView();
        User user = userService.login(username, password);
        if (user != null) {
            mav.setViewName("redirect:/lk");
            mav.addObject("user", user);
        } else {
            mav.addObject("message", "Username or Password is wrong!!");
            mav.setViewName("redirect:/login");
        }
        return mav;
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView showRegister() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("register");
        return mav;
    }



    @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
    public ModelAndView registerProcess(@RequestParam("username") String username,
                                        @RequestParam("password") String password,
                                        @RequestParam("email") String email) {
        ModelAndView mav = new ModelAndView();
        User newUser = new User(username, password, email);

        userService.register(newUser);
        mav.addObject("message", "Registration successful! Please login.");
        mav.setViewName("redirect:/login");
        return mav;
    }



    @RequestMapping(value = "/lk", method = RequestMethod.GET)
    public ModelAndView showLk() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("lk");
        return mav;
    }

}
