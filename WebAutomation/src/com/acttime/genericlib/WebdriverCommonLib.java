package com.acttime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author Savitha
 *
 */

public class WebdriverCommonLib {
	/**
	 * maximum time is 20 seconds used to wait for entire page to load before
	 * performing action on element
	 * 
	 * @param driver
	 */

	public void waitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	/**
	 * wait for element to appear in GUI for every 500ms
	 * 
	 * @param driver
	 * @param element
	 */
	public void waitForElementPresent(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * used to handle any select dropdown based on option data
	 * 
	 * @param element
	 * @param option
	 */
	public void select(WebElement element, String option) {
		Select sel = new Select(element);
		sel.selectByVisibleText(option);
	}

	/**
	 * used to handle any select dropdown based on option index
	 * 
	 * @param element
	 * @param index
	 */
	public void select(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

}
