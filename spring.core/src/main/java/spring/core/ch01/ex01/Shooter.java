package spring.core.ch01.ex01;

public class Shooter {
	private Gun gun;
	//DI는 생성자로 한다.
	public Shooter(Gun gun) {
		this.gun = gun;
	}
	
	public void setGun(Gun gun) {
		this.gun = gun;
	}
	
	public void fire() {
		gun.fire();
	}
}
