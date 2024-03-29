package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("a1")
public class A {
	//Field Injection
	//@Autowired
	private B b;

	public A() {
		System.out.println("A:: 0-param constructor");
	}

	/*//setter Injection
	@Autowired
	public void setB(B b) {
		System.out.println("A.setB()");
		this.b = b;
	}*/

	//arbitary method
	@Autowired
	public void assign(B b) {
		System.out.println("A.assign()");
		this.b = b;
	}
	
	@Override
	public String toString() {
		return "A [b= A obj data ]";
	}
	
}
