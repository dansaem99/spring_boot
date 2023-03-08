package spring.core.ch02.ex01;

public class Rabbit {
	private void sleep() {
		try {
			Thread.sleep((long)(Math.random() * 1000));
		} catch(Exception e) {}
	}
	
	public void start() {
		long start = System.currentTimeMillis();
		sleep();
		long end = System.currentTimeMillis();
		
		System.out.println("토끼: " + (end - start));
	}
}
