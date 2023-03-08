package com.my.spring.web.ch02.ex02;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ch02.ex02")
// 공통된 url을 여기에 적어주면 지저분한 코드로 안적을 수 있다,
@RequestMapping("ch02/ex02")
public class UserController {
	// Get은 꺼내는 작업이다.
	@GetMapping("userIn")
	public String userIn() {
		return "ch02/ex02/userIn";
	}
	
	//RequestParam으로 데이터를 꺼내준다. 기본값이여서 안적어도 문제없다.
	//post는 읽는 작업이다.
	/*
	@PostMapping("userOut")
	public String userOut(@RequestParam String username, 
						@RequestParam int age,
						@RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate regDate,
						Model model) {
		model.addAttribute("user", new User(username, age, regDate));
		return "ch02/ex02/userOut";
	}
	*/
	//RequestParam 기본적으로 있기때문에 없어도 문제가 없다.
	@PostMapping("userOut")
	public String userOut(String username, 
						int age,
						@DateTimeFormat(pattern="yyyy-MM-dd") LocalDate regDate,
						Model model) {
		model.addAttribute("user", new User(username, age, regDate));
		return "ch02/ex02/userOut";
	}
}