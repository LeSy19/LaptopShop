package com.datn.be.service;

import com.datn.be.dto.request.rating.RatingRequestDto;
import com.datn.be.dto.request.rating.RatingUpdateRequestDTO;
import com.datn.be.dto.response.rating.RatingResponseDto;
import com.datn.be.model.Rating;

import java.util.List;

public interface RatingService {
    List<Rating> getRatingsByProduct(Long productId);

    Rating addRating(Long productId, Rating rating, String username); // Thêm tham số username

    RatingResponseDto updateRating(RatingUpdateRequestDTO ratingUpdateRequestDto);
    Rating getRatingById(Long id);

    void deleteRating(Long id);
}
