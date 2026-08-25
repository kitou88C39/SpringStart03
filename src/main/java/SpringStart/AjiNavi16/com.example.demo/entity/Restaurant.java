package com.example.demo.entity;

public class Restaurant {

    private int restaurantId;
    private String restaurantName;
    private String catchPhrase;
    private double avarageRating;

    //平均評価表示
    public String formatAverageRating() {
        String result;

        if(avarageRating == 0.0) {
            result = "-";
        } else {
            result = String.format("% 1f", avarageRating);
        }
        return result;
    }
}
