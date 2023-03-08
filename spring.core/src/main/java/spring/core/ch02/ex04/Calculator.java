package spring.core.ch02.ex04;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	@Log
	public void add() {
		System.out.println( 1 + 2);
	}
	
	public void minus() {
		System.out.println(1 - 1);
	}
	
	@Log
	public void divide() {
		int result = 1/ 0;
		System.out.println(result);
	}
}
