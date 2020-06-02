package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        // read config
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get bean
        Coach theCoach = context.getBean("sensei", Coach.class);

        // call a method
        System.out.println(theCoach.getDailyWorkout());

        // close
        context.close();

    }

}
