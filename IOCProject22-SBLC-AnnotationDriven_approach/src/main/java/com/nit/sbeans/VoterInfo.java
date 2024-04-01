package com.nit.sbeans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("voter")
@PropertySource("com/nit/commons/info.properties")
public class VoterInfo {
	@Value("${voter.name}")
	private String name;
	@Value("${voter.age}")
	private Integer age;
	private Date dov;
	
	public VoterInfo() {
		System.out.println("VoterInfo.VoterInfo()");
	}
	
	@PostConstruct
	public void myInit() {
		System.out.println("VoterInfo.afterPropertiesSet()");
		//initialize left over properties
		dov = new Date();
		//check weather imp properties are injected with correct values or not
		if(name == null || age == null || age<=0)
			throw new IllegalArgumentException("Invalid inputs are given for name or age for both");
	}
	
	@PreDestroy
	public void myDestroy() {
		System.out.println("VoterInfo.destroy()");
		//nullify the bean properties
		name = null;
		age =  null;
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
