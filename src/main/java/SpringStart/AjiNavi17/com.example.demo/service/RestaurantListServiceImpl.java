package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Restaurant;

public interface RestaurantListServiceImple {

    List<Restaurant> findByNameWildcard(String restaurantName);
}
