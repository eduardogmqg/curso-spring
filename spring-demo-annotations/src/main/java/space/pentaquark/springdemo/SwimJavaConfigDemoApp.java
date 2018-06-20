package space.pentaquark.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from the spring container
//        Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
        // Coach theCoach = context.getBean("swimCoach", Coach.class);
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println("email: "  + theCoach.getEmail());

        // close the container
        context.close();
    }

}
