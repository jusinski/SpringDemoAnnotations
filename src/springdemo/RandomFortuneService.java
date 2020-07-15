package springdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Random;

@Primary
@Component
public class RandomFortuneService implements FortuneService{

    private String[] data = {
            "1 Some fortune",
            "2 Some other fortune",
            "3 Super new fortune"
    };

    private Random myRandom = new Random();

    @Override
    public String getFortune(){
        int index = myRandom.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;
    }

}
