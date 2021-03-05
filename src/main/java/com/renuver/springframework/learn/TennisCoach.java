package com.renuver.springframework.learn;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}