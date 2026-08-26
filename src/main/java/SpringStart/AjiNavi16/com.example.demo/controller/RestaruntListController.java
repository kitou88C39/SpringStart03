package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.form.RestaurantSearchForm;

@Controller
@RequiredArgsConstructor
public class RestaurantListController {

    @GetMapping("/top")
    private String restaurantList(
           @ModelAttribute RestaurantSearchForm form) {
        return "restaurant-list";
    }

    @PostMapping("/restaurant-search")
    private String restaurantSearch(
           @ModelAttribute RestaurantSearchForm form,
           Model model) {

        List<Restaurant> list = new ArrayList<Restaurant>();
        list.add(new Restaurant(1,"店舗1","キャッチ1", 3.5));
        list.add(new Restaurant(2,"店舗2","キャッチ2", 3.6));
        list.add(new Restaurant(3,"店舗3","キャッチ3", 3.7));

        model.addAttribute("restaurantList", list);

        return "restaurant-list";
    }
}
