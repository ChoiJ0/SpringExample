package com.eee0.ex.mybatis.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eee0.ex.mybatis.dao.ReviewDAO;
import com.eee0.ex.mybatis.model.Review;

@Service
public class ReviewBO {

	@Autowired ReviewDAO reviewDAO;
	
	// id가 3인 리뷰 가져오기	
	public Review getreview(int id) {
		
		Review review = reviewDAO.selectReview(id);
		
		return review;
	}
	
}
