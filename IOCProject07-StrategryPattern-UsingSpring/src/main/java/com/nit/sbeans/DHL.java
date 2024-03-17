//DHL.java
package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("dhl")
public class DHL implements Courier {

	public DHL() {
		System.out.println("DHL: 0-param constructor");
	}
	
	@Override
	public String delivery(int oid) {
		return oid + " order is set for delivery using DHL Courier Service";
	}

}
