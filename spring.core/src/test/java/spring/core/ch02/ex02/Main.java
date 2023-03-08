package spring.core.ch02.ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Calculator calculator = ctx.getBean(Calculator.class);
		Rabbit rabbit = ctx.getBean(Rabbit.class);
		
		// getResult로 1(clock) clock이 뒤에 붙여있기때문에
		// clock 메소드를 return했기 때문에 나온거다.
		// 만약 저 메소드를 사용을 못했으면 뒤에 clock가 안나온다.
		System.out.println(calculator.calc().getResult());
		System.out.println(rabbit.sleep().getResult());
	}
}
