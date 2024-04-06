package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("cktr")
@PropertySource("com/nit/commons/info.properties")
public abstract class Cricketer {
	@Value("${cktr.id}")
	private Integer id;
	@Value("${cktr.name}")
	private String name;
	@Value("${cktr.jersyNo}")
	private Integer jersyNo;

	
	public Cricketer() {
		System.out.println("Cricketer:: 0-param constructor" + this.getClass());
	}
	
	@Lookup
	public abstract CricketBat getCricketBat();
	
	public void batting() {
		System.out.println("Cricketer.batting()");
		 //get Dependent class obj from the IOC container generated code
		CricketBat bat = getCricketBat();
		//use dependent class object
		int runs = bat.scoreRuns();
		System.out.println(name + " with jersyNo" + jersyNo + " has scored " + runs + " runs");
	}
	
	public void bolwing() {
		System.out.println(name + " with jersyNo:: " + jersyNo + " is bowling");
	}
	
	public void fielding() {
		System.out.println(name + " with jersyNo:: " + jersyNo + " is fielding");
	}
	
	public void wicketKeeping() {
		System.out.println(name + " with jersyNo:: " + jersyNo + " is keeping the wicket");
	}
}
