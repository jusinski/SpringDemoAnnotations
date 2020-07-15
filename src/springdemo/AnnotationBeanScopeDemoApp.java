package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

        public static void main(String[] args){

            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

            Coach theCoach = context.getBean("kendoCoach", Coach.class);
            Coach alphaCoach = context.getBean("kendoCoach", Coach.class);

            boolean result = (theCoach == alphaCoach);

            System.out.println("\nPointing to the same obj: " + result);
            System.out.println("\nMemory location for theCoach: "+ theCoach);
            System.out.println("\nMemory location for alphaCoach: "+ alphaCoach + "\n");

            context.close();
        }
}
