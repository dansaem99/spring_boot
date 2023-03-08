package spring.core.ch02.ex03;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Timer {
	//return * 모든것 spring이 들어간 모든것 int가 들어간. 
	@Before("execution(* spring..*(int))")
	public void clockStart(JoinPoint jp) {
		//toShortString() 주소값 다 나오는게 아니라 메소드명만 나온다.
		//joinpoint 전에 나온다.
		System.out.println(jp.toShortString());
		System.out.println("시작 시간: " + LocalDateTime.now());
	}
	
	/*
	 * After은 before의 반대이다.
	 * execution의 반대가 within이다
	 * joinpoint후에 나온다.
	 */
	@After("within(spring..Calculator)")
	public void clockEnd(JoinPoint jp) {
		System.out.println(jp.toShortString());
		System.out.println("종료 시간: " + LocalDateTime.now());
	}
	
	/* joinpoint 메서드다 위에 2가지 다~~
	 * joinpoint가 성공하면 after나오기전에  나온다.
	 * return를 한다.
	 * return값에 이름을 result로 한다.
	 */
	@AfterReturning(pointcut="bean(calc*)", returning="result")
	//int result를 뒤에 붙여줘야 return값을 알아서 넣어준다.
	public void printResult(JoinPoint jp, int result) {
		System.out.println(jp.toShortString() + ": " + result);
	}
}
