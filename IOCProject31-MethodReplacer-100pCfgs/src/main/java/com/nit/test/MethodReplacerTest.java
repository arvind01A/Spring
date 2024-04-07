package com.nit.test;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.BankService;

public class MethodReplacerTest {

	public static void main(String[] args) {
		//create the IOC container
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		//get the Spring bean class obj
		BankService service = ctx.getBean("bank", BankService.class);
		System.out.println("proxy class obj class name:: " + service.getClass() + " .....super class :: " + service.getClass().getSuperclass());
		System.out.println("Methods List:: " + Arrays.toString(service.getClass().getDeclaredMethods()));
		//invoke the b.method
		double intrAmount = service.calculdateIntrestAmount(100000.0, 2.0, 12.0);
		System.out.println("Intrest Amount:: " + intrAmount);
		
		//close the container
		ctx.close();
	}

}
