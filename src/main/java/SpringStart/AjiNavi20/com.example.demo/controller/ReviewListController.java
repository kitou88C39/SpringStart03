package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.ReviewSearchForm;

@Controller
public class ReviewListController {

    @PostMapping("/search-review")
    private String searchReview(
    @ModelAttribute ReviewSearchForm form,
    Model model) {

    return null;
    }
}
