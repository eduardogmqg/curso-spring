package space.pentaquark.springdemo;

import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
