//StrategyPatternTest.java
package com.nit.test;

import com.nit.comps.Flipkart;
import com.nit.factory.FlipkartFactory;

public class StrategyPatternTest {
	public static void main(String[] args) {
		try {
			//get target class obj(Flipkart class obj) from factory
			Flipkart fpkt = FlipkartFactory.getInstance("dtdc");
			String resultMsg = fpkt.shopping(new String[] {"candles","flowers","cake","wine"}, new double[] {1000.0, 2000.0, 1000.0, 3000.0});
			System.out.println(resultMsg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}//main
}//class
