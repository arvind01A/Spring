//App.java
package com.nit.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.Flipkart;

public class App {
    public static void main( String[] args ) {
        
    	//create IOC container
    	FileSystemXmlApplicationContext ctx =
    			new FileSystemXmlApplicationContext("src/main/java/com/nit/cfgs/applicationContext.xml");
    	//get Target spring bean class obj ref
    	Flipkart fpkt = (Flipkart)ctx.getBean("fpkt");
    	//invoke the b.method
    	String resultMsg = fpkt.shopping(new String[] { "Shirt","Pant","Jeans","T-shirt"}, new double[] {500.0, 800.0, 1000.0, 600.0});
    	System.out.println(resultMsg);
    	//close the container
    	ctx.close();
    }//main
}//class
