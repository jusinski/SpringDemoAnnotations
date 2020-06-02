package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KendoCoach implements Coach {

	private FortuneService fortuneService;

	@Autowired
	public KendoCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "KendoCoach : Strike 300 men's";
	}

	@Override
	public String getDailyFortune() {
		return "KendoCoach : " + fortuneService.getFortune();
	}

}
