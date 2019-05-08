package com.acttime.homepagetest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.acttime.genericlib.BaseClass;

@Listeners(com.acttime.genericlib.ListenerImpClass.class)

public class HomePageTest extends BaseClass{
	
	/*@Test(priority=1)
	public void homepageverifyTest() {

	String expTitle="actiTIME Enter Time-Track";
	String actTitle=driver.getTitle();
	Assert.assertEquals(actTitle, expTitle);*/

@Test(priority=2)
public void homepagelogoImageVerifyTest() {
	boolean status=driver.findElement(By.xpath("//img[contains(@src,'default-logo.png')]")).isEnabled();
	Assert.assertTrue(status);
}
}
