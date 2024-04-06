package com.nit.client;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.sbeans.Cricketer;

public class LookupMethodInjectionTest {
	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		//get the target spring bean class object
		Cricketer cktr = ctx.getBean("cktr", Cricketer.class);
		System.out.println("proxy obj class name:: " + cktr.getClass());
		System.out.println("Proxy class super class name:: " + cktr.getClass().getSuperclass());
		System.out.println("method of proxy class:: " + Arrays.toString(cktr.getClass().getDeclaredMethods()));
		//invoke the b.methods
		cktr.bolwing();
		cktr.fielding();
		cktr.batting();
		System.out.println("____________________________________");
		cktr.batting();
		//close the IOC container
		ctx.close();
	}//main
}//class
