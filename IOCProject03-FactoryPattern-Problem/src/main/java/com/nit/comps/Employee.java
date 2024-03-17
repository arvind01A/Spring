//Employee.java
package com.nit.comps;

public class Employee extends Person {
	private String company;
	private double salary;
	
	public Employee(String name, String addrs, AadharDetails aadhar, String company, double salary) {
		super(name, addrs, aadhar);
		System.out.println("Employee:: 5-param constructor");
		this.company = company;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [company=" + company + ", salary=" + salary + "]";
	}

}
