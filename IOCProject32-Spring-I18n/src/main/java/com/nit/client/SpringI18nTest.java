package com.nit.client;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;

public class SpringI18nTest {
	public static void main(String[] args) {
		//read language, country from enduser
		try(Scanner sc = new Scanner(System.in);
				AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
				){
			System.out.print("Enter language code :: ");
			String lang = sc.next();
			System.out.print("Enter language country code :: ");
			String country = sc.next();
			//prepare Locale obj new having language, country
			Locale locale = new Locale(lang, country);
			
			//get message from IOC container based on Locale object data we pass
			String msg1 = ctx.getMessage("wish.msg", new Object[] {"raja"}, locale);
			String msg2 = ctx.getMessage("bye.msg", new Object[] {"raja"},locale);
			System.out.println(msg1 + "      " + msg2);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}//main
}//class
