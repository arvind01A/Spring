//DTDC.java
package com.nit.comps;

public class DTDC implements Courier {

	public DTDC() {
		System.out.println("DTDC:: 0-param constructor");
	}
	
	@Override
	public String deliver(int oid) {
		return oid+" order id order is assigned to DTDC for Delivery";
	}

}
