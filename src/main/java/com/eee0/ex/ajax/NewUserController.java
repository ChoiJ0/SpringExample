package com.eee0.ex.ajax;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eee0.ex.ajax.bo.NewUserBO;
import com.eee0.ex.ajax.model.NewUser;

@Controller
@RequestMapping("/ajax/user")
public class NewUserController {
	
	@Autowired NewUserBO newUserBO;
	
	//new_user 테이블 결과 보기
	@GetMapping("/list")
	public String userList(Model model) {
		
		List<NewUser> userList =  newUserBO.getUserList();
		
		model.addAttribute("userList", userList);
		
		return "/ajax/userList";
	}
	
	@PostMapping("/insert")
	@ResponseBody
	public String addUser(
			@RequestParam("name") String name
			, @RequestParam("birthday") String birthday
			, @RequestParam("introduce") String introduce
			, @RequestParam("email") String email) {
	
		int count = newUserBO.addUser(name, birthday, introduce, email);
		
		return "삽입결과 : " + count;
	}
	
	@GetMapping("/input")
	public String userInput() {
		
		return "/ajax/userInput";
	}
	
}
