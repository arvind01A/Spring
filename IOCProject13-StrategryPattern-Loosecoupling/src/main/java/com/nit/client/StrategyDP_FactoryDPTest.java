package com.nit.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.nit.sbeans.Flipkart;

public class StrategyDP_FactoryDPTest {

	public static void main(String[] args) {
		
		//create  IOC container
		/*FileSystemXmlApplicationContext ctx=
				new FileSystemXmlApplicationContext("src/main/java/com/nit/cfgs/applicationContext.xml"); */
		
		/*FileSystemXmlApplicationContext ctx=new
				            FileSystemXmlApplicationContext("D:\Java program\Eclipse\Spring Framework\Spring\IOCProject13-StrategryPattern-Loosecoupling\src\main\java\com\nit\cfgs\applicationContext.xml");
		
		*/
		   ClassPathXmlApplicationContext  ctx=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		
		///get Target spring bean class obj ref
		Flipkart fpkt=(Flipkart)ctx.getBean("fpkt");		
		 //invoke the b.method
		 String resultMsg=fpkt.shopping(new String[] {"kurtha-piajama","pathaani","atthar","sweets"},
				                                                      new double[] {2000.0,300.0,1000.0,600.0});
		 System.out.println(resultMsg);
		 //close the container
		 ctx.close();
		}//main

}//class
