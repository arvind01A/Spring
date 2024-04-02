package com.nit.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.sbeans.Cricketer;

public class DependencyLookupTest {
	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		//get the target spring bean class object
		Cricketer cktr = ctx.getBean("cktr", Cricketer.class);
		//invoke the b.methods
		cktr.bolwing();
		cktr.fielding();
		cktr.batting(ctx);
		System.out.println("____________________________________");
		cktr.batting(ctx);
		//close the IOC container
		ctx.close();
	}//main
}//class
