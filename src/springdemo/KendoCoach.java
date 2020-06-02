package springdemo;

import org.springframework.stereotype.Component;

@Component("sensei")
public class KendoCoach implements Coach {

	
	@Override
	public String getDailyWorkout() {
		return "Strike 300 men's";
	}

}
