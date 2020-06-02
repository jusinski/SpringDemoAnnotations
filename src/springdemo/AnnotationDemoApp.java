package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        // read config
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get bean
        Coach theCoach = context.getBean("kendoCoach", Coach.class);
        Coach theCoachTwo = context.getBean("runningCoach", Coach.class);

        // call a method
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoachTwo.getDailyWorkout());

        // close
        context.close();

    }

}
