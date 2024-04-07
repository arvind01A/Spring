package com.nit.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("wmg")
@Lazy
public class WishMessageGenerator {
	@Autowired
	private LocalDateTime dateTime;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}
	
	//write a b.method
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()");
		System.out.println("Injected object is :: " + dateTime);
		//get current hour of the day
		int hour = dateTime.getHour();
		if(hour<12)
			return "Good Morning:: " + user;
		else if(hour<16)
			return "Good Aftroon:: " + user;
		else if(hour<20)
			return "Good Evening:: " + user;
		else
			return "Good Night:: " + user;
	}//method
}//class
