package com.eee0.ex.lifecycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EX02Controller {
	
	@RequestMapping("/lifecycle/ex02/1")
	public String view() {
		return "lifecycle/ex02";
	}
	
}
