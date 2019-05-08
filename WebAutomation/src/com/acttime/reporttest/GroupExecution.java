package com.acttime.reporttest;

import org.testng.annotations.Test;

public class GroupExecution {
	@Test(groups= {"smokeTest"})
	public void createReportTest() {
		System.out.println("execute create report test");
		}
	@Test(groups= {"RegressionTest"})
	public void modifyReportTest() {
		System.out.println("execute modify report test");
	}
		@Test(groups= {"RegressionTest"})
		public void deleteReportTest() {
			System.out.println("execute delete report test");
		}


}
