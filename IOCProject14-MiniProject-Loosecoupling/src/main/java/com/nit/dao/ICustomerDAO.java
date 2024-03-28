//ICustomerDAO.java
package com.nit.dao;

import com.nit.model.Customer;

public interface ICustomerDAO {
	public int insert(Customer cust) throws Exception;
}
