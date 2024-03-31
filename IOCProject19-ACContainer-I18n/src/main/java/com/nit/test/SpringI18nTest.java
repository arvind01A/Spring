package com.nit.test;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringI18nTest {
	public static void main(String[] args) {
		//read language, country from enduser
		try(Scanner sc = new Scanner(System.in);
				ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
				){
			System.out.print("Enter language code:: ");
			String lang = sc.next();
			System.out.print("Enter country code:: ");
			String country = sc.next();
			
			//prepare Locale obj having language, country
			Locale locale = new Locale(lang, country);
			
			//get message from IOC container based on Locale object data we pass
			String msg1 = ctx.getMessage("wish.msg", new Object[] {},  locale);
			String msg2 = ctx.getMessage("bye.msg", new Object[] {}, locale);
			System.out.println(msg1 + " " + msg2);
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}//main
}//class
