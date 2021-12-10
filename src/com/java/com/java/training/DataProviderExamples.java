package com.java.training;

import org.testng.annotations.Test;

	import org.testng.annotations.DataProvider;


	public class DataProviderExamples {
		
		@DataProvider(name="inputs")
		public Object[][] getData() {
			return new Object[][] {
				{"notebook", "Navneet"},
				{"pen", "link"},
				{"pulsar", "150"}
			};
		}
		
		@Test(dataProvider="inputs")
		public void testMethod1(String input1, String input2) {
			System.out.println("Input 1: " + input1);
			System.out.println("Input 2: " + input2);
		}
	}
}
