package com.example.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Restaurant;

@Service
public class RestaurantListServiceImple implements RestaurantListService {

    private final RestaurantRepository repository;

    @Override
    public list<Restaurant> findByNameWildcard(String restaurantName){
        return null;
    }
}
