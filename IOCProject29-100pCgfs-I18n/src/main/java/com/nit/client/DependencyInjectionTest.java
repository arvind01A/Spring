package com.nit.client;

import java.time.LocalDateTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		//create the IOC container
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("-------------IOC container creation-----------------");
		WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class);
		System.out.println("-------------Getting target Spring class object-----------------------");
		String result = generator.generateWishMessage("raja");
		System.out.println("result is :: " + result);
		
		System.out.println("___________________________________________");
		LocalDateTime ldt = ctx.getBean("createDateTime", LocalDateTime.class);
		System.out.println(ldt);
		
		//close the IOC container
		ctx.close();
	}
}
