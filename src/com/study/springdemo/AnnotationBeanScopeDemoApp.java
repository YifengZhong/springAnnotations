package com.study.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		
		boolean result  = (theCoach == alphaCoach);
		System.out.println("result:" + result);
		System.out.println("\nMemeory location for the theCoach:" + theCoach);
		System.out.println("\nMemeory location for the alphaCoach:" + alphaCoach);
		context.close();

		//
	}

}
