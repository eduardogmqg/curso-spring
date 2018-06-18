package space.pentaquark.springdemo;


public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    // Create a no-args constructor
    public CricketCoach() {
        System.out.println("CricketCoach: Inside no-args constructor");
    }

    public String getDailyWorkout() {
        return "Practice Fast Bowling for 15 minutes a day";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // our setter method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: Inside setter method");
        this.fortuneService = fortuneService;
    }
}
