package com.lambdaschool.starthere.controllers;

import com.lambdaschool.starthere.models.User;
import com.lambdaschool.starthere.services.UserService;
import io.swagger.models.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/*
@Controller
@RequestMapping("/admin")
public class HelperController {

    @Autowired
    private UserService userService;

    @ModelAttribute("loggedInUser")
    public User populateUserDetails(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User loggedInUser = userService.findUserByEmail(auth.getName());
        model.addAttribute("isUser", userService.isUser(loggedInUser));
        model.addAttribute("isAdmin", userService.isAdmin(loggedInUser));
        return loggedInUser;
    }

    @RequestMapping(value = "")
    public String adminConsole(Model model){


        //TODO: create admin console template and commands
        return "admin/admin";
    }

    @RequestMapping(value = "create", method = RequestMethod.GET)
    public String create(Model model, @ModelAttribute User loggedInUser){

        populateUserDetails(model);
        model.addAttribute("userName", loggedInUser.getFirstName() + " " + loggedInUser.getLastName());

        User newUser = new User();
        model.addAttribute("user", newUser);

        return "admin/create";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public String createNewAccount(Model model, @Valid User user, BindingResult bindingResult){
        User exists = userService.findUserByEmail(user.getEmail());

        if(exists != null){
            bindingResult.rejectValue("email", "error.user", "This email already exists!");
        }
        if(bindingResult.hasErrors()){
            return "admin/create";
        } else {
            //TODO: allow user to login using either username or email
            char firstInitial = user.getFirstName().charAt(0);
            user.setUsername((firstInitial + user.getLastName()).toLowerCase());
            userService.saveUser(user);
            model.addAttribute("msg","User registered successfully");
            model.addAttribute("user", new User());
            return "admin/create";
        }
    }

}*/
