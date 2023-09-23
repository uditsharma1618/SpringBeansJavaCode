package org.example;

import org.springframework.beans.factory.annotation.Value;

public class CricketCoach implements Coach{
    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String team;
    @Override
    public String getDailyWorkout(){
        return "Practice batting in net daily";
    }
    public String getEmail(){
        return email;
    }
    public String getTeam(){
        return team;
    }
}
