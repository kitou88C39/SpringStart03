package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequiredArgsConstructor
public class RestaurantListController {

    @GetMapping("/top")
    public String RestaurantList(
           @ModelAttribute RestaurantSearchForm form) {
        return "restaurant-list";
    }
}
