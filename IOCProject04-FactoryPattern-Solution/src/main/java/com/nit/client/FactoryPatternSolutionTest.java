//FactoryPatternSolutionTest.java
package com.nit.client;

import com.nit.comps.Person;
import com.nit.factory.PersonFactory;

public class FactoryPatternSolutionTest {
	public static void main(String[] args) {
		Person st = PersonFactory.getInstance("stud");
		System.out.println(st);
		
		System.out.println("=====================================================");
		
		Person emp = PersonFactory.getInstance("emp");
		System.out.println(emp);
	}
}
