package com.my.spring.web.ch02.ex03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ch02.ex03")
@RequestMapping("ch02/ex03/user")
public class UserController {
	//여기서는 지정한 url이 없어 위에 지정한 주소만 적으면 된다.
	//http://localhost/ch02/ex03/user
	@GetMapping
	public String userIn() {
		return "ch02/ex03/userIn";
	}
	
	// 지금 객체를 command라고한다.
	
	@PostMapping
	public String userOut(User user) {
		return "ch02/ex03/userOut";
	}
	//1순위로 여기있는 handler를 사용하고
	//2쉬위로 AppConfig의 view handler를 사용한다.
}
/*
	command object= 커맨드 객체
	커맨드 객체가 되기 위한 조건은 getter, setter가 필수이다.
	역할은 
*/