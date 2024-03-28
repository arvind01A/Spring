//ClassPropertyTest.java
package com.nit.client;

import java.util.Arrays;

class Test{
	public void m1() {
		
	}
}

public class ClassPropertyTest {

	public static void main(String[] args) {
		Class c1=Test.class;
		System.out.println("c1 obj data is ::"+c1.getClass());
		System.out.println("c1 obj data(class) super class is ::"+c1.getSuperclass());
		System.out.println("c1 obj data(class) methods are ::"+Arrays.toString(c1.getDeclaredMethods()));

	}

}
