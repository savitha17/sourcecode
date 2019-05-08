package com.acttime.customertest;

import org.openqa.selenium.By;
import com.acttime.genericlib.WebdriverCommonLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.acttime.genericlib.FileLib;


public class CustomerTest {
	public static void main(String[] args) throws Throwable {
		/* Create an object generic Library class */

		FileLib flib = new FileLib();
		WebdriverCommonLib wlib = new WebdriverCommonLib();

		/* read data from external resource */
		String URL = flib.getPropertyKeyValue("url");
		String USER= flib.getPropertyKeyValue("username");
		String PASSWORD = flib.getPropertyKeyValue("password");

		/* read data from excel */

		String customerName = flib.getExcelData("sheet1", 1, 2);
		System.out.println(customerName);

		/* step1: Login to App */

		WebDriver driver = new ChromeDriver();
		wlib.waitForPageToLoad(driver);
		driver.get(URL);
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys(USER);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.close();
	}

}
