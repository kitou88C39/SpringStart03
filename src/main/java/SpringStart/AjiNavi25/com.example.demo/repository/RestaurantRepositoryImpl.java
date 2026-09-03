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
      "ORDER BY                                      "+
      " mr.restaurant_id                             ";

    String p = "%" + restaurantName + "%";

    List<Map<String, Object>> List
        = jdbcTemplate.queryForList(sql, p);

    //値の取得⇨結果の格納

    List<Restaurant> result = new ArrayList<>();
        for (Map<String, Object> map : list) {
            Restaurant restaurant = new Restaurant();
            restaurant.setRestaurantId(
                (int) one.get("restaurant_id")
            );
            restaurant.setRestaurantName(
                (String) one.get("restaurant_name")
            );
            restaurant.setCatchPhrase(
                (String) one.get("catch_phrase")
            );
            restaurant.setAvarageRating(
                ((Number) one.get("avarage_rating")).doubleValue()
            );
            result.add(restaurant);
        }
    return result;
    }
}
