package spring.core.ch01.ex07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Lion lion = ctx.getBean(Lion.class);
		lion.shout();
		
		ctx.close(); //죽었다를 close로 표현했다.
	}
}
