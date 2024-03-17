//FlipkartFactory.java
package com.nit.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.nit.comps.Courier;
import com.nit.comps.Flipkart;

public class FlipkartFactory {
	private static Properties props;
	
	static {
		System.out.println("FlipkartFactory.static block");
		try {
			//Locate properties file through stream
			InputStream is = new FileInputStream("src/main/java/com/nit/commons/info.properties");
			//Load properties file content to java.util.Properties class obj
			props = new Properties();
			props.load(is);
		}
		catch(IOException ie) {
			ie.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//static factory method
	public static Flipkart getInstance(String courierType) throws Exception{
		//get Dependent class name
		String courierClassName = props.getProperty("courier.classname");
		
		//Load the dependent class
		Class c = Class.forName(courierClassName);
		//create the object for loading class
		Constructor<Courier> cons[] = c.getDeclaredConstructors();
		Courier  courier = cons[0].newInstance();
		
		//create Targer class object
		Flipkart fpkt = new Flipkart();
		fpkt.setCourier(courier);
		return fpkt;
	}
}
