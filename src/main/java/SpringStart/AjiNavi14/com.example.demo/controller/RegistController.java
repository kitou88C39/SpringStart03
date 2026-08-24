package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.ReviewRegistForm;

@Controller
@RequiredArgsConstructor
public class ReviewController {

    private final RegistService service;

    @GetMapping("/show-review-form")
    public String showReviewForm(@ModelAttribute ReviewRegistForm form) {
        return "regist-review";
    }

    @PostMapping("/show-review-form-ret")
    public String registReviewFormRet(
            @ModelAttribute ReviewRegistForm form) {
        return "regist-review";
    }

    @PostMapping("/regist-review")
    public String registReview(
            @Validated @ModelAttribute ReviewRegistForm form,
            BindingResult result) {

        if (result.hasErrors()) {
            return "regist-review";
        }

        return "confirm-regist-review";
    }

    @PostMapping("/confirm-regist-review")
    public String confirmRegistReview(
            @Validated ReviewRegistForm form,
            BindingResult result,
            Model model) {

        if (result.hasErrors()) {
            return "regist-review";
        }

        //DTOを渡してserviceのregist()メソッドを呼び出す
        Review　r = new Review();
        r.setRestaurantId(form.getRestaurantId());
        r.setUserId(form.getUserId());
        r.setVisitDate(form.getVisitDate());
        r.setRating(form.getRating());
        r.setComment(form.getComment());
        String msg = service.regist(r);

        model.addAttribute("msg", msg);

        return "complete-regist-review";
    }
}
