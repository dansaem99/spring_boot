package spring.core.ch02.ex02;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("spring.core.ch02.ex02")
@EnableAspectJAutoProxy
public class AppConfig {
	/*
	 * @EnableAspectJAutoProxy 를 사용해
	 * timer에 사용한 @Aspect,@Around,@Pointcut를
	 * 알아먹을 수 있는것이다.
	 */
}
