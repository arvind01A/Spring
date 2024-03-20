//CustomerOperationsConstroller.java
package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.model.Customer;
import com.nit.service.ICustomerMgmtService;

@Controller("custController")
public class CustomerOperationsController {
	@Autowired
	private ICustomerMgmtService custService;
	
	public String processCustomer(Customer customer) throws Exception {
		//use service
		String result = custService.registrerCustomer(customer);
		return result;
	}
	
}
