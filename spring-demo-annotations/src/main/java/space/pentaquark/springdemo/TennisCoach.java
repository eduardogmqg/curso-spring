package space.pentaquark.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("thatSillyCoach")
@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

    @Autowired
//    @Qualifier("happyFortuneService")
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    // Define a default constructor

    public TennisCoach() {
        System.out.println(">> TennisCoach: Inside default constructor");
    }

    // Define a setter method
    /*@Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(">> TennisCoach: Inside setter method: setFortuneService()");
        this.fortuneService = fortuneService;
    }*/



    // define my init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> TennisCoach: Inside doMyStartupStuff");
    }
    // define my destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println(">> TennisCoach: Inside doMyCleanupStuff");
    }

    /*@Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
