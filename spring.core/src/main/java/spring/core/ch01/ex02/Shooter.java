package spring.core.ch01.ex02;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import spring.core.ch01.ex01.Gun;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Shooter { 
	private String shooterName;
	private Gun gun;
	
	public void fire() {
		System.out.print(shooterName + ": ");
		gun.fire();
	}
}