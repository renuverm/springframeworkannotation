package com.renuver.springframework.learn;

import org.springframework.beans.factory.annotation.Value;

public class FootballCoach implements Coach{

    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String Email;

    @Value("${foo.team}")
    private String Team;

    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return Email;
    }

    public String getTeam() {
        return Team;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice for 1 hour";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
