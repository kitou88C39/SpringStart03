package com.example.demo.service;

import com.example.demo.entity.Review;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RegistServiceImpl implements RegistService {

    private final RegistRepository repository;

    @Override
    public void regist(Review review){
    }
}
