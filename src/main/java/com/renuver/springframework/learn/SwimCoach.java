package com.renuver.springframework.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String Email;

    @Value("${foo.team}")
    private String Team;

    public String getEmail() {
        return Email;
    }

    public String getTeam() {
        return Team;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim for 5miles";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
