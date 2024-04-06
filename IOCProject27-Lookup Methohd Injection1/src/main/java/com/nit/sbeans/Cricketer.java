package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("cktr")
@PropertySource("com/nit/commons/info.properties")
public interface Cricketer {
	@Value("${cktr.id}")
	Integer id=0;
	@Value("${cktr.name}")
	String name=null;
	@Value("${cktr.jersyNo}")
	Integer jersyNo=0;
	
	@Lookup
	public abstract CricketBat getCricketBat();
	
	default void batting() {
		System.out.println("Cricketer.batting()");
		 //get Dependent class obj from the IOC container generated code
		CricketBat bat = getCricketBat();
		//use dependent class object
		int runs = bat.scoreRuns();
		System.out.println(name + " with jersyNo" + jersyNo + " has scored " + runs + " runs");
	}
	
	default void bolwing() {
		System.out.println(name + " with jersyNo:: " + jersyNo + " is bowling");
	}
	
	default void fielding() {
		System.out.println(name + " with jersyNo:: " + jersyNo + " is fielding");
	}
	
	default void wicketKeeping() {
		System.out.println(name + " with jersyNo:: " + jersyNo + " is keeping the wicket");
	}
}
