package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}
	
	@Override
	public String getRandomFortune() {
		
		String[] array = {"Today is lucky day!", "Today is not that great!", "Today is an awful day!"};
		int rnd = new Random().nextInt(array.length);
		
		return array[rnd];
		
	}

}
