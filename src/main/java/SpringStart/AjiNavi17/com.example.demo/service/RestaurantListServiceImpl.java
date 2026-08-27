package com.example.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Restaurant;
import com.example.demo.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RestaurantListServiceImple implements RestaurantListService {

    private final RestaurantRepository repository;

    @Override
    public list<Restaurant> findByNameWildcard(String restaurantName){
        List<Restaurant> list
            = repository.selectByNameWildcard(restaurantName);

        return list;
    }
}
