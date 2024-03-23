//PersonalInfo.java
package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pInfo")
public class PersonalInfo {
	//Injacting values collect from the properties file
	@Value("${per.name}")
	private String name;
	
	@Value("${per.addrs}")
	private String addrs;
	
	@Value("${per.age}")
	private int age;
	
	//Injecting the direct values
	@Value("841438")
	private Long pinCode;
	
	//Injecting the system property values
	@Value("${os.name}")
	private String osName;
	
	@Value("${os.version}")
	private String osVersion;
	
	//Injecting environment variable values
	@Value("${Path}")
	private String pathData;

	//toString()
	@Override
	public String toString() {
		return "PersonalInfo [name=" + name + "\naddrs=" + addrs + "\nage=" + age + "\npinCode=" + pinCode + "\nosName="
				+ osName + "\nosVersion=" + osVersion + "\npathData=" + pathData + "]";
	}
	
	
}//class
