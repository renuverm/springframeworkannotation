package com.renuver.springframework.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")  //  for explicit use
@Component
public class TennisCoach implements Coach {
	private FortuneService fortuneService;

	@Autowired // autowired at constructor
	public TennisCoach(	@Qualifier("randomFortuneService") FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
