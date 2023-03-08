package spring.core.ch01.ex04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import spring.core.ch01.ex01.Gun;
import spring.core.ch01.ex02.Shooter;

@Configuration
@Import({Config1.class, Config2.class})
public class AppConfig {
	 
	@Autowired private Gun pistol; //@Autowired가 gun에 pistol를 연결해준다.
	@Autowired private Gun rifle;
	
	@Bean
	public Shooter shooter1() {
		return new Shooter("최한석", pistol);
	}
	
	@Bean
	public Shooter shooter2() {
		Shooter shooter = new Shooter();
		shooter.setShooterName("한아름");
		shooter.setGun(rifle);
		
		return shooter;
	}
} 
