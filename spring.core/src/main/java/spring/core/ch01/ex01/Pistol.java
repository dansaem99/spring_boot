package spring.core.ch01.ex01;

public class Pistol implements Gun{
	@Override
	public void fire() {
		System.out.println("권총 탕탕.");
	}
}
