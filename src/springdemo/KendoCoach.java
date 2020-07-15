package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class KendoCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;

	// define def contructor
	public KendoCoach(){
		System.out.println(">> KendoCoach: inside DEFINE contructor");
	}

	@PostConstruct
	public void doMyStartup(){
		System.out.println(">> KendoCoach: inside DOING some stuff");
	}

	@PreDestroy
	public void doMyCleanup(){
		System.out.println(">> KendoCoach: inside DESTROING some stuff");
	}




	// define setter method
	/*
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> KendoCoach: inside setFortuneService method");
		fortuneService = theFortuneService;
	}
	*/

	/*
	@Autowired
	public KendoCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/

	@Override
	public String getDailyWorkout() {
		return "KendoCoach : Strike 300 men's";
	}

	@Override
	public String getDailyFortune() {
		return "KendoCoach : " + fortuneService.getFortune();
	}

}
