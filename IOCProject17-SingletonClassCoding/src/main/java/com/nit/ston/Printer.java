//Printer.java
package com.nit.ston;

public class Printer {
	//static ref variable
	private static Printer INSTANCE;
	
	private Printer() {
		System.out.println("Printer:: 0-param constructor");
	}
	
	//public static factory method
	public static Printer getInstance() {
		if(INSTANCE == null)
			INSTANCE = new Printer();
		return INSTANCE;
	}
	
	public void print(String msg) {
		System.out.println(msg);
	}
}
