package com.example.demo.repository;

import java.util.List;

import org.springframework.jdbc.core.jdbcTemplate;
import com.example.demo.entity.Repository;

import com.example.demo.entity.Restaurant;
import lombok.RequiredArgsConstructor;


@Repository
@RequiredArgsConstructor
public class RestaurantRepositoryImpl implements ReviewRepository {

    private final jdbcTemplate jdbcTemplate;

    @Override
    public void add(Review review){

      String sql =
      "SELECT"+
      " mr.restaurant_id,                            "+
      " mr.restaurant_name,                          "+
      " mr.restaurant_phrase,                        "+
      " COALESCE(AVG(tr.rating), 0.0) avarage_rating "+
      "FROM                                          "+
      " m_restaurant_mr                              "+
      " LEFT OUTER JOIN t_review tr                  "+
      "        ON mr.restaurant_id = tr.restaurant_id"+
      "WHERE                                         "+
      " mr.restaurant_name LIKE?                     "+
      "GROUP BY                                      "+
      " mr.restaurant_id,                            "+
      " mr.restaurant_name,                          "+
      " mr.catch_phrase                              "+
      "ORDER BY"+
      " mr.restaurant_id                             ";
    return null;
    }
}
