package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("a1")
public class A {
	private B b;

	@Autowired
	public A(B b) {
		this.b = b;
		System.out.println("A:: 1-param constructor");
	}

	@Override
	public String toString() {
		return "A [b= A obj data ]";
	}
	
	
}
