package com.example.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Review;

@Service
public class ReviewListServiceImpl implements ReviewListService {

    @Override
    public List<Review> findByRestaurantId(int restaurantId);
        return null;
}
