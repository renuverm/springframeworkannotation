package com.renuver.springframework.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;



	// define a default constructor
	public CricketCoach() {
		System.out.println(">> CricketCoach: inside default constructor");
	}
/*
	// define a setter method
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> CricketCoach: inside setFortuneService() method");
		this.fortuneService = theFortuneService;
	}*/


	@Override
	public String getDailyWorkout() {
		return "Practice balling for 5 hours";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
