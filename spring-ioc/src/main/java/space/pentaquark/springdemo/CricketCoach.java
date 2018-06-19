package space.pentaquark.springdemo;


public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    private String emailAddress;
    private String team;


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
        System.out.println("CricketCoach: Inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: Inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: Inside setter method - setTeam");
        this.team = team;
    }
}
