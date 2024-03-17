//BlueDart.java
package com.nit.comps;

public class BlueDart implements Courier {
	
	public BlueDart() {
		System.out.println("BlueDart:: 0-param constructor");
	}
	
	@Override
	public String deliver(int oid) {
		return oid + " order id order is assinged to BlueDart for Delivery";
	}
}
