package space.pentaquark.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    public String getDailyFortune() {
        return "Just do it: " + fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartStuff() {
        System.out.println("TrackCoach: inside method - doMyStartStuff");
    }
    // add a destroy method
    public void doMyCleanupStuff() {
        System.out.println("TrackCoach: inside method - doMyCleanupStuff");
    }
}
