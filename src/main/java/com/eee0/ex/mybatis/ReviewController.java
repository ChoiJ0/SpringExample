package com.eee0.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eee0.ex.mybatis.bo.ReviewBO;
import com.eee0.ex.mybatis.model.Review;

@Controller
public class ReviewController {

	@Autowired ReviewBO reviewBO;
	
	// id가  3인 리뷰 가져오기
	// /mybatis/ex01/1?id=8
	@ResponseBody
	@RequestMapping("/mybatis/ex01/1")
	public Review review(
//			@RequestParam("id")int id
//			@RequestParam(value="id", required=true) int id
//			@RequestParam(value="id", required=false) int id 
			@RequestParam(value="id", defaultValue="1") int id //기본값
			
			
			) {
		
		Review review = reviewBO.getreview(id);
		
		return review;
		
	}
	
	@ResponseBody
	@RequestMapping("/mybatis/ex02/1")
	public String addReview() {
		
		// 리뷰 한행 저장
		// storeId, menu, userName, point, review
		// 4, "콤비네이션 피자, "김바다", 4.5, "할인도 많이 받고 잘 먹었습니다"
		
		int count = reviewBO.addReview(4, "콤비네이션 피자", "김바다", 4.5, "할인도 많이 받고 잘 먹었습니다.");
	
		return "삽입 결과 : " + count;	
		
	}
	
	@ResponseBody
	@RequestMapping("/mybatis/ex02/2")
	public String addReviewByObject() {
		// 2, 뿌링클, "김인규", 4.0, "역시 뿌링클은 진리 입니다!!"
		
		Review review = new Review();
		
		review.setStoreId(2);
		review.setMenu("뿌링클");
		review.setUserName("김인규");
		review.setPoint(4.0);
		review.setReview("역시 뿌링클은 진리 입니다!");
		
		int count = reviewBO.addReviewByObject(review);
		
		return "삽입 결과 : " + count;
		
	}
	
	
	
}
