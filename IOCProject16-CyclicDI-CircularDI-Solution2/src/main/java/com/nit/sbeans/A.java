package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("a1")
public class A {
	//Field Injection
	@Autowired
	private B b;

	public A() {
		System.out.println("A:: 0-param constructor");
	}
	
	@Override
	public String toString() {
		return "A [b= A obj data ]";
	}
	
}
