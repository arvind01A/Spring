package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nit.dao.ICustomerDAO;
import com.nit.model.Customer;

@Service("custService")
public class CustomerMgmtServiceImpl implements ICustomerMgmtService {
	@Autowired
	@Qualifier("custDAO-mysql")
	private  ICustomerDAO custDAO;
	
	@Override
	public String registrerCustomer(Customer customer) throws Exception {
		//calculate discount, final amount
		double discountAmount = (customer.getBillAmount()*(customer.getDiscount()/100.0));
		double finalAmount = customer.getBillAmount() - discountAmount;
		//set finalAmount to model class object
		customer.setFinalAmount(finalAmount);
		//use DAO
		int count = custDAO.insert(customer);
		return count == 0 ? "Customer registration failed" : "\n\t\t\tCustomer registration having successfully\n\t\t\t\t\tBillAmount \t:: " + customer.getBillAmount() + "\n\t\t\tDiscount Amount \t:: " + discountAmount + "\n\t\t\t\tfinal Amount \t:: " + finalAmount;
	}

}
