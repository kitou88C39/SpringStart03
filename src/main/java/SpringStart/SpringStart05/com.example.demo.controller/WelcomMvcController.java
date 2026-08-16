package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomMvcontroller {

    @GetMapping("/welcome-m")
    public String welcomeM(Model model) {

        model.addAttribute("greeting","Hello");
        model.addAttribute("welcome","Welcom MVC(Model)");

        return "welcome-mvc";
    }
}
