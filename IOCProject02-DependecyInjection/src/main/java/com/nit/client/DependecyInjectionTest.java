//DependecyInjectionTest.java
package com.nit.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.SeasonFinder;

public class DependecyInjectionTest {
	public static void main(String[] args) {
		//create IOC container
		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("src/main/java/com/nit/cfgs/applicationContext.xml");
		//get target spring bean class obj ref
		Object obj = ctx.getBean("sf");
		//typecasting
		SeasonFinder finder = (SeasonFinder)obj;
		//invoke the b.method
		String result = finder.findoutSeasonName("raja");
		System.out.println(result);
		
		//close container
		ctx.close();
	}
}
