package Gmaillogin;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyEditBoxText {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		WebElement wb=driver.findElement(By.id("identifierId"));
		//capture size
		Dimension dem=wb.getSize();
		System.out.println("height of email edit---"+dem.getHeight());
		System.out.println("width of email edit---"+dem.getWidth());
		//capture location
		
		Point p=wb.getLocation();
		System.out.println("x co-ordinate of email edit---"+p.getX());
		System.out.println("y co-ordinate of email edit---"+p.getY());
		
		//verify editbox backend text
		
		String expval= "Email or phone";
		String actval=wb.getAttribute("aria-label");
		if(expval.equals(actval))
		{
			System.out.println("backend value is verified---pass");
		} 
		else
		{
			System.out.println("backend value is verified---fail");
		}
		//type data on editbox and capture data
		
		wb.sendKeys("savitha.v14@gmail.com");
		System.out.println(wb.getAttribute("value"));
		}
		
	}


