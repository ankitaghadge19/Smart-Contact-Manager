package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserConroller {

    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String UserDashboard() {
        return "user/dashboard";
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String UserProfile() {
        return "user/profile";
    }
}
