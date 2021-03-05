package com.renuver.springframework.withoutxml;

import com.renuver.springframework.learn.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
	   AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from spring container - default id
		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
				
		// close the context
		context.close();
		
	}

}


