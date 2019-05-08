package com.acttime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Createcustomer {
	
	@FindBy(name="name")
	private WebElement customerName;
	
	@FindBy(name="description")
	private WebElement customerDescEdt;
	
	@FindBy(name="createCustomerSubmit")
	private WebElement createcustomerBtn;
	
	public void createCustomer(String CustomerName)
	{
		customerName.sendKeys(CustomerName);
		createcustomerBtn.click();
	}
	public void createCustomer(String CustomerName,String customerDesc)
	{
		customerName.sendKeys(CustomerName);
		customerDescEdt.sendKeys(customerDesc);
		createcustomerBtn.click();
		
	}

}
