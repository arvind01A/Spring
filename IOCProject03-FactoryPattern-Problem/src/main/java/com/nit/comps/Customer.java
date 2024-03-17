//Customer.java
package com.nit.comps;

public class Customer extends Person {
	private int txtId;
	private double billAmt;
	
	public Customer(String name, String addrs, AadharDetails aadhar, int txtId, double billAmt) {
		super(name, addrs, aadhar);
		System.out.println("Customer:: 5-param constructor");
		this.txtId = txtId;
		this.billAmt = billAmt;
	}

	@Override
	public String toString() {
		return "Customer [txtId=" + txtId + ", billAmt=" + billAmt + "]";
	}
	
}
