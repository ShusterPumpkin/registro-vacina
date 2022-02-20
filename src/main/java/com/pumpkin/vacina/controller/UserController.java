package com.pumpkin.vacina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.pumpkin.vacina.model.User;
import com.pumpkin.vacina.repository.UserRepository;
 
@Controller
public class UserController {
 
    @Autowired
    private UserRepository userRepo;
   
    @GetMapping("")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
 
        return "register";
    }
    
    @PostMapping("/register")
    public String processRegister(User user) {   

        userRepo.save(user);
        return "register";
    } 
    
}