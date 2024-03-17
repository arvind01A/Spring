//FlipkartFactory.java
package com.nit.factory;

import com.nit.comps.BlueDart;
import com.nit.comps.Courier;
import com.nit.comps.DTDC;
import com.nit.comps.Flipkart;

public class FlipkartFactory {
	//static factory method
	public static Flipkart getInstance(String courierType) {
		//create Dependent class object
		Courier courier= null;
		if(courierType.equalsIgnoreCase("dtdc")) 
			courier = new DTDC();
		else if(courierType.equalsIgnoreCase("blueDart"))
			courier = new BlueDart();
		else
			throw new IllegalArgumentException();
		
		//create Targer class object
		Flipkart fpkt = new Flipkart();
		fpkt.setCourier(courier);
		return fpkt;
	}
}
