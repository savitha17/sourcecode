package com.acttime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
	
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement taskImg;
	
	@FindBy(xpath="//div[text()='Users']")
	private WebElement userImg;
	
	@FindBy(id="logoutLink")
	private WebElement logoutlnk;
	
	public void clickonTaskImage()
	{
		taskImg.click();
	}
	public void clickonUserImage()
	{
		userImg.click();
	}
	public void Logout()
	{
		logoutlnk.click();
	}
	

}
