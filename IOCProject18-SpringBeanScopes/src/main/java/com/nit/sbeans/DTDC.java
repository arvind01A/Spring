//DTDC.java
package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements Courier {
	
	public DTDC() {
		System.out.println("DTDC: 0-param constructor");
	}
	
	@Override
	public String delivery(int oid) {
		return oid + " order is set for delivery using DTDC Courier Service";
	}
}