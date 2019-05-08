package com.acttime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Task {
	@FindBy(linkText="Projects & Customers")
	private WebElement projectAndCustomerLnk;

public void clickonProjectandCustomerLnk()
{
	projectAndCustomerLnk.click();
}
}
