//FactoryPatternProblem.java
package com.nit.client;

import com.nit.comps.AadharDetails;
import com.nit.comps.Employee;
import com.nit.comps.Person;
import com.nit.comps.Student;

public class FactoryPatternProblem {
	public static void main(String[] args) {
		AadharDetails details = new AadharDetails(252872131194L, 24, 7079960499L);
		Person st = new Student("Arvind", "Bihar", details, 1010, "JAVA");
		System.out.println(st);
		
		System.out.println("=============================================================");
		
		AadharDetails details1 = new AadharDetails(252872131194L, 24, 7079960499L);
		Person emp = new Employee("Arvind", "Bihar", details1, "NiT", 40000);
		System.out.println(emp);
	}
}
