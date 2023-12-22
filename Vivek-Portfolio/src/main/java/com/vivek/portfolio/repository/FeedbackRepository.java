package com.vivek.portfolio.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vivek.portfolio.entity.Feedback;

@Repository
public interface FeedbackRepository extends MongoRepository<Feedback, String> {
}
