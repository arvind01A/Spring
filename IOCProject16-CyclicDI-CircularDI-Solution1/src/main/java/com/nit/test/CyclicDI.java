//ClientApp
package com.nit.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.sbeans.A;

public class CyclicDI {
	public static void main(String[] args) {
		//create the IOC container
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		
		//get spring bean class object
		A a1 = ctx.getBean("a1", A.class);
		System.out.println(a1);
		
		//close the container
		ctx.close();
	}//main
}//class
