package springdemo;

import org.springframework.stereotype.Component;

@Component
public class KendoCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Strike 300 men's";
	}

}
