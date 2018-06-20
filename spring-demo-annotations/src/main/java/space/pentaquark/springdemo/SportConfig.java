package space.pentaquark.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("space.pentaquark.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    // define bean for our sad fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    // define bean for out swim coach and inject dependencies
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }

}
