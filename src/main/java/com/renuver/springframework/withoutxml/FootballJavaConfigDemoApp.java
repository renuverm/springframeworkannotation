package com.renuver.springframework.withoutxml;

import com.renuver.springframework.learn.Coach;
import com.renuver.springframework.learn.FootballCoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FootballJavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
	   AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from spring container - default id
		Coach theCoach = context.getBean("footballCoach", Coach.class);

		FootballCoach footballCoach = context.getBean("footballCoach", FootballCoach.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());

		// email
		System.out.println( "email:" +footballCoach.getEmail());

		// team
		System.out.println( "team:" +footballCoach.getTeam());
				
		// close the context
		context.close();
		
	}

}


