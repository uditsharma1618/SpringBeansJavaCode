package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
        CricketCoach cricCoach = context.getBean("CricketCoach", CricketCoach.class);
        System.out.println(cricCoach.getDailyWorkout());
        System.out.println(cricCoach.getEmail());
        System.out.println(cricCoach.getTeam());
    }
}