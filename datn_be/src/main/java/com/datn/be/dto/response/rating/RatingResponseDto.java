package com.datn.be.dto.response.rating;


import com.datn.be.dto.request.rating.RatingRequestDto;
import com.datn.be.model.Rating;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RatingResponseDto {

    private Long id;
    private String content;
    private int numberStars;
    private String userName;
    private String adminResponse;

    public static RatingResponseDto fromRatingToRatingResponse(Rating rating){
        RatingResponseDto ratingResponse = RatingResponseDto.builder()
                .id(rating.getId())
                .content(rating.getContent())
                .numberStars(rating.getNumberStars())
                .adminResponse(rating.getAdminRespone())
                .build();

        return ratingResponse;

    }


}
