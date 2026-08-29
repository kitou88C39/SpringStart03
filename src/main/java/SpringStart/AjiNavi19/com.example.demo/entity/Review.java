package com.example.demo.form;

import java.sql.Data;

@Data
public class Review {

    private Integer reviewId;
    private Integer restaurantId;
    private String restaurantName;
    private Date visitDate;
    private Integer rating;
    private String comment;
}
