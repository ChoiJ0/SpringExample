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
	
}
