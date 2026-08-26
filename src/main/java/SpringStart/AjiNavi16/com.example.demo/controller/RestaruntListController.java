package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.form.RestaurantSearchForm;

@Controller
@RequiredArgsConstructor
public class RestaurantListController {

    @GetMapping("/top")
    private String RestaurantList(
           @ModelAttribute RestaurantSearchForm form) {
        return "restaurant-list";
    }
}
