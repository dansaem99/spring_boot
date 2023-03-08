package spring.core.ch02.ex02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect	
@Component
public class Timer {
	/* pointcut 사용법과 설명
	메소드를 execution으로 표현했다.
	그래서 execution을 꼭 앞에 붙여서 사용해야한다.
	그리고 class명을 뒤에 넣어준다.
	public 뒤 *은 return을 말하고 all이라는 뜻이다.
	주소뒤 *은 무엇이든 상관없다.
	(..)은 0개 이상이라는 말이다.*/
	@Pointcut("execution(public * spring.core.ch02.ex02..*(..))")
	private void myPointcut() {}
	
	@Around("myPointcut()")
	//proceed()를 쓰고 싶어서 (ProceedingJoinPoint jp) 이거 사용
	public Object clock(ProceedingJoinPoint jp) throws Throwable {
		// 아래의 프린트는 25번줄이 나온거다.
		//Result spring.core.ch02.ex02.Calculator.calc()
		System.out.println(jp.getSignature());
		
		long start = System.currentTimeMillis();
		Result result = (Result)jp.proceed();
		long end = System.currentTimeMillis();
		
		System.out.println("경과시간: " + ( end - start));
		// clock이 뒤에 적혀있으면 clock를 리턴에 사용했다는 뜻
		result.setResult(result.getResult() + "(clock)");
		return result;
	}
}
//aop를 spring로 사용할거다.