package com.study.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component  //if do not set "thatSillCoach", it will use tennisCoach as default bean ID"
@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Value("${foo.email}")
	private String email;
	    
	@Value("${foo.team}")
	private String team;
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
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
