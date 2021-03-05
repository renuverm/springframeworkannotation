package com.renuver.springframework.learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container - explicit id
		//Coach theCoach = context.getBean("thatSillyCoach", Coach.class);

		// get the bean from spring container - default id
		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		Coach cricketCoach = context.getBean("cricketCoach", Coach.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		System.out.println(cricketCoach.getDailyWorkout());

		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());

		System.out.println(cricketCoach.getDailyFortune());
				
		// close the context
		context.close();
		
	}

}


