package space.pentaquark.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
    // Create an array of string
    private String[] data = {
                "Beware of the wolf in sheep's clothing",
                "Diligence is the mother of good luck",
                "The journey is the reward"
            };


    // create a random number generator
    private Random myRandom = new Random();


    public String getFortune() {
        // Pick a random string of the array
        int index = myRandom.nextInt(data.length);

        return data[index];
    }
}
