package com.study.springdemo;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")  //if do not set "thatSillCoach", it will use tennisCoach as default bean ID"
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {

		return "Practice your backhand volley";
	}
}
