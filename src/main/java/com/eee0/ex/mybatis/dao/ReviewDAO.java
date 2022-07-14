package com.eee0.ex.mybatis.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.eee0.ex.mybatis.model.Review;

@Repository
public interface ReviewDAO {

	// new_review 테이블에서 id3인 리뷰 가져오기
	public Review selectReview(@Param("id") int id);
	
	public int insertReview(@Param("storeId") int storeId
			, @Param("menu") String menu
			, @Param("userName") String userName
			, @Param("point") double point
			, @Param("review") String review);

	public int addReviewByObject(Review review);
	
	
	
	
}
