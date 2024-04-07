//Flipkart.java
package com.nit.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Flipkart {
	  //HAS-A property
	@Autowired
	@Qualifier("transporter")
	private  Courier  courier;
	
	public Flipkart() {
		System.out.println("Flipkart:: 0-param constructor");
	}
	
	
	
	//b.method
	public  String  shopping(String items[],double prices[]) {
		 // calculate bill amount
		  double total=0.0;
		  for(double p: prices) 
			  total=total+p;
		 //generate  random number as the order id
		  int oid=new Random().nextInt(1000);
		  //use   courier
		  String msg=courier.deliver(oid);
		  return  Arrays.toString(items)+" are purchased having prices "+Arrays.toString(prices)+ " , bill amt :"+total+" ---> "+msg;
		  
		  
	}

}
