package com.nit.sbeans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class VoterInfo implements InitializingBean, DisposableBean {
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

	@Override
	public void destroy() throws Exception {
		System.out.println("VoterInfo.destroy()");
		//nullify the bean properties
		name = null;
		age =  null;
		dov = null;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("VoterInfo.afterPropertiesSet()");
		//initialize left over properties
		dov = new Date();
		//check weather imp properties are injected with correct values or not
		if(name == null || age == null || age<=0)
			throw new IllegalArgumentException("Invalid inputs are given for name or age for both");
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
