package com.example.demo.repository;

import com.example.demo.entity.Repository;

@Repository
@RequiredArgsConstructor
public class ReviewRepositoryImpl implements ReviewRepository {

    private final jdbcTemplate jdbcTemplate;

    @Override
    public void add(Review review){

      String sql =
        "INSERT INTO t_review" +
        "(restaurant id, user id, visit_date, rating, comment)" +
        "VALUES(?,?,?,?,?)";

      jdbcTemplate.update(sql, review.getRestaurantId(),
                               review.getUserId(),
                               review.getVisitDate(),
                               review.getRating(),
                               review.getComment(),);
    }
}
