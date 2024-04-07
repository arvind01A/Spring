package com.nit.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class InterestRateReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("InterestRateReplacer.reimplement(-,-,-) (simple interest calculation)");
		//write new logic here
		//get the target method avg values
		double pamt = (double)args[0];
		double time = (double)args[1];
		double rate = (double)args[2];
		//calculate simple interest amount
		return (pamt*time*rate)/100.0;
	}

}
