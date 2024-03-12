//SeasonFinder.java
package com.nit.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
	@Autowired
	private LocalDate date;
	
	public SeasonFinder() {
		System.out.println("SeasonFinder:: 0-param constructor");
	}
	
	public String findoutSeasonName(String user) {
		System.out.println("SeasonFinder.findoutSeasonName()");
		//get month value
		int month = date.getMonthValue();
		if(month>=3 && month<=6) 
			return "Hot summer season " + user;
		else if(month>=7 && month<=10)
			return "Drizzling rainy season " + user;
		else 
			return "Cool winter season " + user;
	}
}
