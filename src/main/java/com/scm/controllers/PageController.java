package com.scm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.scm.entities.User;
import com.scm.forms.UserForm;
import com.scm.helpers.Message;
import com.scm.helpers.MessageType;
import com.scm.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class PageController {

    @Autowired
    private UserService userService;

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Home Page Handler!");
        model.addAttribute("name", "Ankita");
        model.addAttribute("github", "https://github.com/ankitaghadge19");
        return "home";
    }

    // about route
    @RequestMapping("/about")
    public String aboutPage(Model model) {
        model.addAttribute("isLogin", true);
        System.out.println("About Page Handler!");
        return "about";
    }

    // services route
    @RequestMapping("/services")
    public String servicesPage() {
        System.out.println("Services Page Handler!");
        return "services";
    }

    // contact route
    @GetMapping("/contact")
    public String contactPage() {
        System.out.println("Contact Page Handler!");
        return "contact";
    }

    // login route
    @GetMapping("/login")
    public String loginPage() {
        System.out.println("login Page Handler!");
        return "login";
    }

    // register route
    @GetMapping("/register")
    public String registerPage(Model model) {
        // System.out.println("Register Page Handler!");

        UserForm userForm = new UserForm();
        // userForm.setName("Ankita");
        model.addAttribute("userForm", userForm);
        return "register";
    }

    // processing register
    @PostMapping("/do-register")
    public String processRegister(@Valid @ModelAttribute UserForm userForm, BindingResult bindingResult,
            HttpSession session) {
        System.out.println(userForm);

        if (bindingResult.hasErrors()) {
            return "register";
        }

        User user = new User();
        user.setName(userForm.getName());
        user.setEmail(userForm.getEmail());
        user.setPassword(userForm.getPassword());
        user.setPhoneNo(userForm.getPhoneNo());
        user.setAbout(userForm.getAbout());
        user.setProfilePic(
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fstock.adobe.com%2Fsearch%3Fk%3D%2522default%2Bprofile%2Bpicture%2522&psig=AOvVaw1jnZ5aoplZwR6SNmenBjuJ&ust=1726743740440000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCJjlhfWrzIgDFQAAAAAdAAAAABA9");

        Message message = Message.builder().content("Registration Sucessful!").type(MessageType.green).build();
        session.setAttribute("message", message);

        userService.saveUser(user);
        return "redirect:/register";
    }
}