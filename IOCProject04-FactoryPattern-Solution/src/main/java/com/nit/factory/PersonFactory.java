//PersonFactory.java
package com.nit.factory;

import com.nit.comps.AadharDetails;
import com.nit.comps.Customer;
import com.nit.comps.Employee;
import com.nit.comps.Person;
import com.nit.comps.Student;

//factory pattern class
public class PersonFactory {
	
	//public static factory method creating and returning One of Person(AC) sub object
	//this method contains factory pattern logic
	public static Person getInstance(String personType) {
		Person per = null;
		if(personType.equalsIgnoreCase("emp")) {
			AadharDetails detials = new AadharDetails(707080809090l, 24, 9304616074l);
			per = new Employee("Arvind", "Bihar", detials, "NiT", 354870);
		} else if(personType.equalsIgnoreCase("cust")) {
			AadharDetails details1 = new AadharDetails(404050506060l, 40, 6543217890l);
			per = new Customer("Ankit", "Hyd", details1, 1001, 3025.54);
		} else if(personType.equalsIgnoreCase("stud")) {
			AadharDetails detilas2 = new AadharDetails(101020203030l, 30, 9876543210l);
			per= new Student("Arvind", "Hyd", detilas2, 1010, "JAVA");
		} else {
			throw new IllegalArgumentException("Invalid PersonType");
		}
		return per;
	}
}
