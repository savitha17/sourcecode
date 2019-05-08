package com.acttime.com.acttime.testscripts;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Assertion {
	@Test
	public void createReportTest() {
		System.out.println("step1");
		System.out.println("step2");
		Assert.assertEquals("A", "B");
		System.out.println("step3");
		Assert.assertEquals("X", "Y");
		System.out.println("step4");
		
	}
	@Test
	public void modifyReportTest() {
    System.out.println("----------");	
	System.out.println("step1");
	System.out.println("step2");
	System.out.println("step3");
	System.out.println("step4");
	}


}
