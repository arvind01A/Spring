package com.nit.sbeans;

import java.util.Date;

public class VoterInfo {
	private String name;
	private Integer age;
	private Date dov;
	
	public VoterInfo() {
		System.out.println("VoterInfo.VoterInfo()");
	}


	public void setName(String name) {
		System.out.println("VoterInfo.setName()");
		this.name = name;
	}
	
	public void setAge(int age) {
		System.out.println("VoterInfo.setAge()");
		this.age = age;
	}
	
	public void myInit() {
		System.out.println("VoterInfo.myInit()");
		dov = new Date();
		//check weather imp properties are injected with correct values or not
		if(name == null || age == null || age<=0)
			throw new IllegalArgumentException();
	}
	
	public void myDestroy() {
		System.out.println("VoterInfo.myDestroy()");
		//nullify the bean properties
		name = null;
		age = null;
		dov = null;
	}
	
	//b.method
	public String checkVotingEligibility() {
		System.out.println("VoterInfo.checkVotingEligibility()");
		if(age<18)
			return "Mr/Miss/Mrs. " +  name + " having age " + age + " u r not eligible for voting :: verified on :: " + dov;
		else
			return "Mr/Miss/Mrs. " + name + " having age " + age + " u r eligible for voting :: verified on :: " + dov;
	}
}
