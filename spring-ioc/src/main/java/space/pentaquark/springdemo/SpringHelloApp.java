package space.pentaquark.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

    public static void main(String[] args) {

        // Load the Spring Configuration File
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve a Bean from Spring Container
        Coach coach = context.getBean("myCoach", Coach.class);

        // Call the methods of the bean
        System.out.println(coach.getDailyWorkout());

        // Close the application context
        context.close();
    }

}
