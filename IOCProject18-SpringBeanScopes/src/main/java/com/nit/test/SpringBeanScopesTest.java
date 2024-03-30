//App.java
package com.nit.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.sbeans.Flipkart;
import com.nit.ston.Printer;

public class SpringBeanScopesTest {
    public static void main( String[] args ) {
        
    	//create IOC container
    	ClassPathXmlApplicationContext ctx = 
    			new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
    	
    	//get Target spring bean class obj ref
    	Flipkart fpkt = ctx.getBean("fpkt", Flipkart.class);
    	Flipkart fpkt1 = ctx.getBean("fpkt", Flipkart.class);
    	//invoke the b.method
    	String resultMsg = fpkt.shopping(new String[] { "Shirt","Pant","Jeans","T-shirt"}, new double[] {500.0, 800.0, 1000.0, 600.0});
    	
    	System.out.println(resultMsg);
    	System.out.println(fpkt.hashCode() + " " + fpkt1.hashCode());
    	System.out.println("fpkt==fpkt1?"+ (fpkt==fpkt1));
    	System.out.println("______________________________________");
    	Printer o1 = ctx.getBean("p1", Printer.class);
    	Printer o2 = ctx.getBean("p2", Printer.class);
    	System.out.println(o1.hashCode() + " " + o2.hashCode() );
    	System.out.println("o1==o2?" + (o1==o2));
    	//close the container
    	ctx.close();
    }//main
}//class