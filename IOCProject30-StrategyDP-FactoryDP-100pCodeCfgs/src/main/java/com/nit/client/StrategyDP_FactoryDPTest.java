//ClientApp
package com.nit.client;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.Flipkart;
public class StrategyDP_FactoryDPTest {

	public static void main(String[] args) {
		
	   // create the IOC container
		  AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
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
