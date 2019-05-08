package com.acttime.customertest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.acttime.genericlib.BaseClass;
import com.acttime.objectrepositorylib.Createcustomer;
import com.acttime.objectrepositorylib.Home;
import com.acttime.objectrepositorylib.ProjectAndCustomer;
import com.acttime.objectrepositorylib.Task;

import junit.framework.Assert;

@Listeners(com.acttime.genericlib.ListenerImpClass.class)

public class CutomerTestObjRepo extends BaseClass{
	@Test
	public void createCustomerTest() throws Throwable {
		String CustomerName=flib.getExcelData("Sheet1",1,1);
	
	Home hp=PageFactory.initElements(driver,Home.class);
	hp.clickonTaskImage();
	
	Task Ts=PageFactory.initElements(driver, Task.class);
	Ts.clickonProjectandCustomerLnk();
	
	ProjectAndCustomer pac=PageFactory.initElements(driver, ProjectAndCustomer.class);
	pac.clickoncreatecustomerBtn();
	
	Createcustomer cp= PageFactory.initElements(driver, Createcustomer.class);
	cp.createCustomer(CustomerName);
	
	String actsussmsg=pac.getSuccessMsg().getText();
	boolean status=actsussmsg.contains("successfully created");
	Assert.assertTrue(status);

}
	@Test
	public void createCustomerwithDescTest() throws Throwable {
		String CustomerName=flib.getExcelData("Sheet1",2,2);
		
	String customerDesc=flib.getExcelData("Sheet1",2,3);
	
	Home hp=PageFactory.initElements(driver,Home.class);
	hp.clickonTaskImage();
	
	Task Ts=PageFactory.initElements(driver, Task.class);
	Ts.clickonProjectandCustomerLnk();
	
	ProjectAndCustomer pac=PageFactory.initElements(driver, ProjectAndCustomer.class);
	pac.clickoncreatecustomerBtn();
	
	Createcustomer cp= PageFactory.initElements(driver, Createcustomer.class);
	cp.createCustomer(CustomerName);
	
	String actsussmsg=pac.getSuccessMsg().getText();
	boolean status=actsussmsg.contains("successfully created");
	Assert.assertTrue(status);
	}
}
