package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.ReviewRegistForm;

@Controller
public class ReviewController {

    @GetMapping("/show-review-form")
    public String showReviewForm(@ModelAttribute ReviewRegistForm form){
        return "regist-review";
    }

    @PostMapping("/show-review-form-ret")
    public String registReviewFormRet(@ModelAttribute RegistReviewForm form){
        return "regist-review";
    }

    @PostMapping("/show-review")
    public String registReview(@ModelAttribute RegistReviewForm form){
        return "confirm-regist-review";
    }

    @PostMapping("/confirm-regist-review")
    public String confirmRegistReview(RegistReviewForm form, Model model){
        return "regist-review";
    }

    model.addAttribute("msg","レビュー登録が完了しました。");d

    return "complete-regist-review";
    }
}
