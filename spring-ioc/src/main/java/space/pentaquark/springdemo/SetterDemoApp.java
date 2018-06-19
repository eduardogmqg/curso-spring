package space.pentaquark.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {

        // Load the Spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean for spring container
        // Coach theCoach = context.getBean("myCricketCoach", Coach.class);

        // Nota: Para usar las propiedades emailAdress y team, el objeto tiene que ser
        // de tipo CricketCoack ya que son propiedades específicas de esa clase
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        // call method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // call our new method to get the literal values
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        // close the context
        context.close();
    }

}
