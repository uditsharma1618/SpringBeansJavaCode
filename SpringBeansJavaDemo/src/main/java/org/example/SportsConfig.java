package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sports.properties")
public class SportsConfig {
    @Bean
    public Coach CricketCoach(){
        return new CricketCoach();
    }
}
