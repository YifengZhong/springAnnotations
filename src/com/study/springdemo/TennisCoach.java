package com.study.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component  //if do not set "thatSillCoach", it will use tennisCoach as default bean ID"
public class TennisCoach implements Coach {
	
	@Value("${foo.email}")
	private String email;
	    
	@Value("${foo.team}")
	private String team;
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	//due to java version greater than 9
	//we should import relative lib manually to
	//use these anotation.
	//define my init method
	/*
	 * @PostConstruct 
	 * public void doMyStartupStuff() {
	 * System.out.println("This ini method."); 
	 * } //define my destroy method
	 * 
	 * @PreDestory 
	 * public void doMyCleanupStuff() {
	 * System.out.println("this destroy method");
	 *  }
	 */	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach:inside default constructor");
	}

	@Override
	public String getDailyWorkout() {

		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
