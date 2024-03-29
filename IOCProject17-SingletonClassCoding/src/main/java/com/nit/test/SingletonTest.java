//SingletonTest.java
package com.nit.test;

import com.nit.ston.Printer;

public class SingletonTest {
	private void main() {
		Printer p1 = Printer.getInstance();
		Printer p2 = Printer.getInstance();
		p1.print("hello");
		p2.print("hai");
		System.out.println(p1.hashCode() + "  " + p2.hashCode());
		System.out.println("p1==p2?" + (p1==p2));
	}
}
