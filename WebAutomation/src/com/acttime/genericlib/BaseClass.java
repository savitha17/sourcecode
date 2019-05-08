package com.acttime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.acttime.objectrepositorylib.Home;
import com.acttime.objectrepositorylib.Login;
import com.acttime.objectrepositorylib.ProjectAndCustomer;

public class BaseClass {
	public static WebDriver driver;
	public FileLib flib=new FileLib();
	
	@BeforeSuite
	public void configBeforeSuite() {
		System.out.println("connect to data base");
		
	}
	
	/*@Parameters("browser")
	@BeforeTest
	public void configBT(String browserValue) {
		if (browserValue.equals("InternetExplorer")) {
			driver=new InternetExplorerDriver();
		}else if (browserValue.equals("Chrome"));
			
		}*/
	
	
	@BeforeClass
	public void configBC() throws Throwable {
		System.out.println("Launch a browser");
		String Browser=flib.getPropertyKeyValue("browser");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(flib.getPropertyKeyValue("url"));
	}
	
		@BeforeMethod
		public void configBM() throws Throwable {
			System.out.println("Login");
			Thread.sleep(3000);
			driver.get(flib.getPropertyKeyValue("url"));
			Login lp=PageFactory.initElements(driver, Login.class);
			lp.loginToApp();
			/*driver.findElement(By.name("username")).sendKeys(flib.getPropertyKeyValue("username"));
			driver.findElement(By.name("pwd")).sendKeys(flib.getPropertyKeyValue("password"));
			driver.findElement(By.id("loginButton")).click();*/
		}
	/*	@Test
		public void homepageVerifyTest() throws InterruptedException {
			Thread.sleep(3000);
			String expTitle="actiTIME - Enter Time-Track";
			String actTitle=driver.getTitle();
			Assert.assertEquals(actTitle, expTitle);
		}*/
		
		@AfterMethod
		public void configAM() throws InterruptedException {
			System.out.println("Logout");
			Thread.sleep(3000);
			Home hp=PageFactory.initElements(driver,Home.class);
			hp.Logout();
			/*driver.findElement(By.id("logoutLink")).click();*/
		}
		
		@AfterClass
		public void configAC() {
			System.out.println("close browser");
			driver.close();
		
			
		
		
	}
	

}
