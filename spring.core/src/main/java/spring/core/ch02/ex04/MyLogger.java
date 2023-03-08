package spring.core.ch02.ex04;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLogger {
	private final Logger logger;
	
	public MyLogger() {
		logger = LogManager.getLogger(MyLogger.class);
	}
	
	@After("@annotation(spring.core.ch02.ex04.Log)")
	public void log(JoinPoint jp) {
		logger.info(jp.toShortString());
	}
	
	//execution(public void spring.core.ch02.ex04.Calculator.divide()): / by zero
	@AfterThrowing(pointcut="@annotation(spring.core.ch02.ex04.Log)", throwing="ex")
	public void logError(JoinPoint jp, Throwable ex) {
		logger.error(jp.toLongString() + ": " + ex.getMessage());
	}
}
