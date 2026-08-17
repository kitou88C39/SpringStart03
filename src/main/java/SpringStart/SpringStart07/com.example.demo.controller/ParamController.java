package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamController {

    @PostMapping("/post-param")
    public String getParam(@RequestParam greeting,
            Model model) {

        model.addAttribute("mGreeting",greeting);

        return "deiplay";
    }
}
