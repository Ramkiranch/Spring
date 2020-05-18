package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: Inside default constructor");
	}
	
	

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	// define a setter method and inject dependencies using setter method
	/*
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: Inside setFortuneService() method");
		this.fortuneService = fortuneService;
	}
	*/
	
	// Custom method for setter injection
	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: Inside setFortuneService() method");
		this.fortuneService = fortuneService;
	}
	*/



	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";	
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
