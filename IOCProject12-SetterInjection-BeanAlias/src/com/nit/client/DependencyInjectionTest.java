//DependencyInjectionTest.java
package com.nit.client;

import java.time.LocalDateTime;

import org.springframework.context.support.FileSystemXmlApplicationContext; 

import com.nit.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		//create the IOC container
		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("src/com/nit/cfgs/applicationContext.xml");
		
		//get target spring bean class cfg class obj from the IOC container
		Object obj = ctx.getBean("wmg");
		WishMessageGenerator generator = ctx.getBean("wmg",WishMessageGenerator.class);
		
		//invoke the b.method
		String result = generator.generateWishMessage("raja");
		System.out.println("Result : " + result);
		
		System.out.println("______________________________");
		LocalDateTime dt1 = ctx.getBean("ldt",LocalDateTime.class);
		LocalDateTime dt2 = ctx.getBean("l1",LocalDateTime.class);
		LocalDateTime dt3 = ctx.getBean("l2",LocalDateTime.class);
		System.out.println(dt1 + " " + dt2 + " " + " " + dt3);
		
		LocalDateTime dt4 = ctx.getBean("l3",LocalDateTime.class);
		LocalDateTime dt5 = ctx.getBean("l4",LocalDateTime.class);
		System.out.println(dt4 + " " + dt5);
		
		LocalDateTime dt6 = ctx.getBean("lt",LocalDateTime.class);
		System.out.println(dt6);
		
		//close the IOC container
		ctx.close();
	}//main
}//class
