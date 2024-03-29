//Client app
package com.nit.client;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.controller.CustomerOperationsController;
import com.nit.model.Customer;

public class RealTimeDI {
	public static void main(String[] args) {
		//read input values from enduser
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter customer name:: ");
		String name = sc.nextLine();
		
		System.out.print("Enter customer address:: ");
		String addrs = sc.nextLine();
		
		System.out.print("Enter customer bill amount:: ");
		double billAmt = sc.nextDouble();
		
		System.out.print("Enter discount percentage:: ");
		double discount = sc.nextDouble();
		
		//create customer class object
		Customer cust = new Customer();
		cust.setCname(name);
		cust.setCaddrs(addrs);
		cust.setBillAmount(billAmt);
		cust.setDiscount(discount);
		
		//create IOC container
		try (
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
				){
		
		//get Controller class object from the IOC container (dependency lookup)
		CustomerOperationsController controller = 
				ctx.getBean("custController", CustomerOperationsController.class);
		
		//invoke the b.method
			String resultMsg = controller.processCustomer(cust);
			System.out.println(resultMsg);
		}
		catch(SQLException se) {
			if(se.getErrorCode() == 12899)	//SQLError code
				System.out.println("Problem with column size");
			else
				System.out.println("One or another DB problem");
		}
		catch(Exception e) {
			System.out.println("Non DB problem\nInternal Problem ------ Try again:: " + e.getMessage());
			//e.printStackTrace();
		}
		
	}//main
}//class
