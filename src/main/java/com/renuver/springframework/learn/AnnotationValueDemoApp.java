package com.renuver.springframework.learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationValueDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

        System.out.println( swimCoach.getDailyWorkout());

        System.out.println(swimCoach.getDailyFortune());

        System.out.println(swimCoach.getEmail());

        System.out.println(swimCoach.getTeam());

        context.close();
    }
}
