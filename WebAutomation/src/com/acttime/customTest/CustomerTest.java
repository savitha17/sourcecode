package com.acttime.customTest;

import org.testng.annotations.Test;

public class CustomerTest {
	@Test(groups= {"smokeTest"})
	public void createCustomerTest() {
		System.out.println("execute create customer test");
		}
	@Test(groups= {"RegressionTest"})
	public void modifyCustomerTest() {
		System.out.println("execute modify customer test");
	}
		@Test(groups= {"RegressionTest"})
		public void deleteCustomerTest() {
			System.out.println("execute delete customer test");
		}

}
