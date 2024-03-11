//DependencyInjectionTest.java
package com.nit.client;

import org.springframework.context.support.FileSystemXmlApplicationContext; 

import com.nit.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		//create the IOC container
		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("src/com/nit/cfgs/applicationContext.xml");
		
		//get target spring bean class cfg class obj from the IOC container
		Object obj = ctx.getBean("wmg");
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		
		//invoke the b.method
		String result = generator.generateWishMessage("raja");
		System.out.println("Result : " + result);
		
		//close the IOC container
		ctx.close();
	}//main
}//class
