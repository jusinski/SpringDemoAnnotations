package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RunningCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public RunningCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "RunningCoach : Run 10 km";
    }

    @Override
    public String getDailyFortune() {
        return "RunningCoach : " + fortuneService.getFortune();
    }

}
