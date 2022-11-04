package com.miu.edu.spring.data.service.impl;

import com.miu.edu.spring.data.dto.ReviewDto;
import com.miu.edu.spring.data.repository.ReviewRepository;
import com.miu.edu.spring.data.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public List<ReviewDto> getReviewsByProductId(int productId) {
        return reviewRepository.getAllByProductId(productId).stream().map(ReviewDto::convertFrom).toList();
    }

    @Override
    public ReviewDto getReviewById(int id) {
        return ReviewDto.convertFrom(reviewRepository.findById(id).orElse(null));
    }

    @Override
    public void updateReview(ReviewDto review) {
        reviewRepository.findById(review.getId()).ifPresent(r -> {
            r.setComment(review.getComment());
            reviewRepository.save(r);
        });
    }

    @Override
    public void addReview(ReviewDto review) {
        reviewRepository.save(ReviewDto.convertTo(review));
    }

    @Override
    public void removeById(int id) {
        reviewRepository.deleteById(id);
    }
}
