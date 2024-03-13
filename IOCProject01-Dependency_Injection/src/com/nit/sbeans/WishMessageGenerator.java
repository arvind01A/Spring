//WishMessageGenerator.java
package com.nit.sbeans;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	//HAS-A property
	@Autowired									// Field Injection
	private LocalDateTime dateTime;															
	@Autowired
	private Date date;
	
	/*													// Constructor Injection
	@Autowired
	public WishMessageGenerator(LocalDateTime dateTime, Date date) {															
		System.out.println("WishMessageGenerator: 2-param constructor");
		this.dateTime = dateTime;
		this.date = date;
	}
	//@Autowired
	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator: 1- param constructor");
		this.date = date;
	}
	*/
	
	/*													// Setter Injection
	//setter method for setter injection
	@Autowired
	public void setDateTime(LocalDateTime dateTime) {							
		System.out.println("WishMessageGenerator.setDateTime()");
		this.dateTime = dateTime;
	}
	
	@Autowired
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}
	*/
	
	/*												// Arbitary method Injection
	@Autowired
	public void putDateTime(LocalDateTime dateTime) {
		System.out.println("WishMessageGenerator.putDateTime()");
		this.dateTime = dateTime;
	}
	@Autowired
	public void putDate(Date date) {
		this.date = date;
	}
	*/
	
	//b.method
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()");
		System.out.println("LocaDateTime : " + dateTime + "\nDate : " + date);
		//get current hour of day
		int hour = dateTime.getHour();
		//generate the wish message
		if(hour<12)
			return "Good morning " + user;
		else if(hour < 16)
			return "Good afternoon " + user;
		else if(hour < 20)
			return "Good evening " + user;
		else 
			return "Good night " + user;
	}
}//class
