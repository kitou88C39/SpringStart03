package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.form.RestaurantSearchForm;

@Controller
@RequiredArgsConstructor
@RequiredArgsConstructor
public class RestaurantListController {

    private final RestaurantListService service;

    @GetMapping("/top")
    private String restaurantList(
           @ModelAttribute RestaurantSearchForm form) {
        return "restaurant-list";
    }

    @PostMapping("/restaurant-search")
    private String restaurantSearch(
           @ModelAttribute RestaurantSearchForm form,
           Model model) {

        List<Restaurant> list
            = service.findByNameWildcard(form.getRestaurantName());

        model.addAttribute("restaurantList", list);

        return "restaurant-list";
    }
}
