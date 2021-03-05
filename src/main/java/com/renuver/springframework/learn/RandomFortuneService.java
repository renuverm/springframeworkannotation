package com.renuver.springframework.learn;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

		
	@Override
	public String getFortune() {
		String[] data = {
				"Beware of the wolf in sheep's clothing",
				"Diligence is the mother of good luck",
				"The journey is the reward"
		};

		Random random = new Random();
		int i = random.nextInt(data.length);
		String theFortune = data[i];
		return theFortune;
	}

}


