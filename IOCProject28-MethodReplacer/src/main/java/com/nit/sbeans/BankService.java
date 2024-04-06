package com.nit.sbeans;

public class BankService {
	
	public double calculdateIntrestAmount(double pamt, double rate, double time) {
		System.out.println("BankService.calculdateIntrestAmount() (Compund Interest calculation)");
		return (pamt*Math.pow(1+rate/100, time))-pamt;
	}
}
