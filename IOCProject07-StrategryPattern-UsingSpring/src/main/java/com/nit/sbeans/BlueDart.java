//BlueDart.java
package com.nit.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bDart")
@Primary
public class BlueDart implements Courier {
	
	public BlueDart() {
		System.out.println("BlueDart: 0-param constructor");
	}

	@Override
	public String delivery(int oid) {
		return oid + " order is set for delivery using BlueDart Courier Service";
	}
}
