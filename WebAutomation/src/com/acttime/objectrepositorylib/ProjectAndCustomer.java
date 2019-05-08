package com.acttime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectAndCustomer {
	
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement createcustomerBtn;
	
	@FindBy(xpath="//span[@class='successmsg']")
	private WebElement Successmsg;
	
	public void clickoncreatecustomerBtn()
	{
		createcustomerBtn.click();
	}
	public WebElement getSuccessMsg()
	{
		return Successmsg;
	}
	

}
