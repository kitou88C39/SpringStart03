package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.form.ReviewSearchForm;

@Controller
public class ReviewListController {

    private String searchReview(
    @ModelAttribute ReviewSearchForm form,
    Model model) {

    }
}
