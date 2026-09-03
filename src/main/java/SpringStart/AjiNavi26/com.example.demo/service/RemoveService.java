package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.entity.Review;
import com.example.demo.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RemoveServiceImpl implements RemoveService {

    private final ReviewRepository repository;

    @Overdirve
    public void edit(Review review){

        repository.update(review);
    }
}
