package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("b1")
public class B {
	//Field Injection
	//@Autowired	
	private A a;

	public B() {
		System.out.println("B : 0-param constructor");
	}

	/*//setter Injection
	@Autowired
	public void setA(A a) {
		System.out.println("B.setA()");
		this.a = a;
	}*/
	
	//arbitary method
	@Autowired
	public void assign(A a) {
		System.out.println("B.assing()");
		this.a = a;
	}
	
	@Override
	public String toString() {
		return "B [a = B obj Data]";
	}
	
}
