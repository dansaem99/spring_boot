package com.my.spring.web.ch02.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	// 그릇안에 model이랑 view를 만들어준다.
	// 메소드가 handler가 되는거다. 그리고 call해준다.
	// handler가 return한 mv는 
	@GetMapping("11")
	public ModelAndView handler11(ModelAndView mv) {
		mv.addObject("user", new User("최한석", 11));
		mv.setViewName("ch02/ex01/user");
		
		return mv;
	}
	
	@GetMapping("21")
	public String handler21(Model model) {
		model.addAttribute("user", new User("한아름", 21));
		return "ch02/ex01/user";
	}
	
	@GetMapping("22")
	public String handler22() {
		return "ch02/ex01/user";
	}
	
	// void가 들어가기때문에 return을 하면 에러가 뜬다.
	// 그럼 handler명으로 리턴하는거다.
	// 이거 테스트할때http://localhost/ch02/ex01/31
	// 뒤에 다 붙여줘야한다.
	@GetMapping("ch02/ex01/31")
	public void handler31(User user) {
		user.setUsername("양승일");
		user.setAge(31);
	}
	
	@GetMapping("ch02/ex01/32")
	public void handler32(@ModelAttribute("man") User user) {
		user.setUsername("서준한");
		user.setAge(32);
	}
	
	@GetMapping("ch02/ex01/41")
	public User handler41(User user) {
		user.setUsername("김가람");
		user.setAge(21);
		
		return user;
	}
	
	@GetMapping("ch02/ex01/42")
	@ModelAttribute("man")
	public User handler42(User user) {
		user.setUsername("박건우");
		user.setAge(41);
		
		return user;
	}
}
/*
 * view하나로 model를 여러가지 만들 수 있다.
 */