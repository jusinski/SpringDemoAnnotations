package springdemo;

import org.springframework.stereotype.Component;

@Component
public class RunningCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run 10 km";
    }

}
