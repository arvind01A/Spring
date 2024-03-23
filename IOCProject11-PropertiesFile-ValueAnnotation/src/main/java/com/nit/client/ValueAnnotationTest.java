//ValueAnnotationTest.java
package com.nit.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.sbeans.PersonalInfo;

public class ValueAnnotationTest {
	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		//get Spring Bean class obj ref
		PersonalInfo info = ctx.getBean("pInfo", PersonalInfo.class);
		System.out.println(info);
		
		//close the container
		ctx.close();
	}
}
