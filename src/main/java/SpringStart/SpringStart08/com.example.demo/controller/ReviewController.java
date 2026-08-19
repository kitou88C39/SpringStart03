package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReviewController {

    @GetMapping("/show-review-form")
    public String showReviewForm(){
        return "regist-review";
    }

    @PostMapping("/regist-review")
    public String registReview(@ModelAttribute RegistReviewForm form){
        System.out.println(form);
        return "confirm-regist-review";
    }
}
