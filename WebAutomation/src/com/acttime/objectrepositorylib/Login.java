package com.acttime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.genericlib.FileLib;

public class Login {
	@FindBy(name="username")
	private WebElement usernameEdt;
	
	@FindBy(name="pwd")
	private WebElement passwordEdt;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	public void loginToApp() throws Throwable
	{
	
	FileLib flib=new FileLib();
    usernameEdt.sendKeys(flib.getPropertyKeyValue("username"));
    passwordEdt.sendKeys(flib.getPropertyKeyValue("password"));
    loginButton.click();
    
}
}
