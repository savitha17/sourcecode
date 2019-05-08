package com.acttime.com.acttime.testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Assert{
	@Test
	public void createReportTest() {
		System.out.println("step1");
		System.out.println("step2"); 
		SoftAssert s=new SoftAssert();
		s.assertEquals("A", "B");
		System.out.println("step3");
		s.assertEquals("X", "Y");
		System.out.println("step4");
		s.assertAll();
		
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
