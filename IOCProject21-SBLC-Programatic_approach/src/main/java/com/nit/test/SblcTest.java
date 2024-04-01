package com.nit.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.sbeans.VoterInfo;

public class SblcTest {
	public static void main(String[] args) {
		//create IOC container
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml")){
			//get Spring bean class object ref
			VoterInfo info = ctx.getBean("voter", VoterInfo.class);
			//invoke the b.method
			String resultMsg = info.checkVotingEligibility();
			System.out.println(resultMsg);
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}
	}//main
}//class
