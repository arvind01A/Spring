package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("b1")
public class B {
	private A a;

	@Autowired
	public B(A a) {
		this.a = a;
		System.out.println("B : 1-param constructor");
	}

	@Override
	public String toString() {
		return "B [a = B obj Data]";
	}
	
}
