//Flipkart.java
package com.nit.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Flipkart {
	
	@Autowired
	private Courier courier;
	
	public Flipkart() {
		System.out.println("Flipkart:: 0-param constructor");
	}
	
	public String shopping(String items[] , double prices[]) {
		//calc bill amount
		double total = 0.0;
		for(double p: prices)
			total += p;
		
		//generate random number as the order id
		int oid = new Random().nextInt(100000);
		//use courier
		String msg = courier.delivery(oid);
		return Arrays.toString(items) + " are purchased having prices " + Arrays.toString(prices) + " , bill amount: " + total + " -------> " + msg;
	}
}
