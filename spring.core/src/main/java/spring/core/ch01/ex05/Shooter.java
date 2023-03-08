package spring.core.ch01.ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class Shooter {
	@Autowired @Nullable private Gun pistol;
	@Autowired @Nullable private Gun rifle;
	
	public void fire() {
		try {
			pistol.fire();
			rifle.fire();
		} catch(NullPointerException e) {}		
	}
}
