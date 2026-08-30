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

    review = new Review();
    review.setReviewId(2);
    review.setRestaurantId(1);
　　　　review.setUserId("userId");
    review.setVisitDate(Date valueOf("2027-02-20"));
    review.setRaring(4);
    review.setCommit("comment2");
    list.add(review);

    if(list.size()>0){
        model.addAttribute("reviewList", list)
    }

    return null;
    }
}
