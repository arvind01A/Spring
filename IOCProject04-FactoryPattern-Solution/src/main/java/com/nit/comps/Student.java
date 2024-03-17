//Student.java
package com.nit.comps;

public class Student extends Person {
	private int rollno;
	private String course;
	
	public Student(String name, String addrs, AadharDetails aadhar, int rollno, String course) {
		super(name, addrs, aadhar);
		System.out.println("Student:: 5-param constructor");
		this.rollno = rollno;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", course=" + course + "]";
	}

}
