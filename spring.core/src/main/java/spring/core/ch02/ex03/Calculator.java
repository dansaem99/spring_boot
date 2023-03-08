package spring.core.ch02.ex03;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	public int calc(int num) {
		try {
			Thread.sleep((long)(Math.random() * 1000));
		} catch(Exception e) {}
		
		System.out.println("Calculator.calc()");
		return num;
	}
}
