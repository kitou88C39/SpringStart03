package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.web.servlet.ModelAndView;

@Controller
public class WelcomMvcontroller {

    @GetMapping("/welcome-m")
    public String welcomeM(Model model) {

        model.addAttribute("greeting","Hello");
        model.addAttribute("welcome","Welcom MVC(Model)");

        return "welcome-mvc";
    }

    @GetMapping("/welcome-mv")
    public ModelAndView welcomeMv(ModelAndView mv) {

        model.addAttribute("greeting","Hello");
        model.addAttribute("welcome","Welcom MVC(ModelAndView)");

        mv.setViewName("welcome-mvc");

        return mv;
    }
}
