package com.nit.sbeans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("bat")
public class CricketBat {

	public CricketBat() {
		System.out.println("CricketBat.CricketBat()");
	}
	
	public int scoreRuns() {
		return new Random().nextInt(200);
	}

}
