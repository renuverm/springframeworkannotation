package com.renuver.springframework.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("thatSillyCoach")  //  for explicit use
@Component
@Scope("prototype")
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

	@PostConstruct
	public void setStartUpService() {
		System.out.println(">> TennisCoach: inside setStartUpService method");
	}

	@PreDestroy
	public void setCleanUpService() {
		System.out.println(">> TennisCoach: inside setCleanUpService method");
	}

}
