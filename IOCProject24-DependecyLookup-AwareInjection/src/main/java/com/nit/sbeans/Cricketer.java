package com.nit.sbeans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cktr")
@PropertySource("com/nit/commons/info.properties")
public class Cricketer implements ApplicationContextAware {
	@Value("${cktr.id}")
	private Integer id;
	@Value("${cktr.name}")
	private String name;
	@Value("${cktr.jersyNo}")
	private Integer jersyNo;
	
	private ApplicationContext ctx;
	
	public Cricketer() {
		System.out.println("Cricketer:: 0-param constructor");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("Cricketer.setApplicationContext()");
		this.ctx = ctx;
	}
	
	public void batting() {
		System.out.println("Cricketer.batting()");
		 //get Dependent class obj through ""Dependnecy lookup""
		 //CricketBat  bat=ctx.getBean("bat",CricketBat.class);
		CricketBat bat = ctx.getBean(CricketBat.class);
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
