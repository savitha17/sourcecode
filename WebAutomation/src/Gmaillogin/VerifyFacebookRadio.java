package Gmaillogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyFacebookRadio {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		boolean fwb=driver.findElement(By.id("u_0_9")).isSelected();
		
		boolean mwb=driver.findElement(By.id("u_0_a")).isSelected();
		if(fwb==false && mwb==false)
		{
			System.out.println("is unselected===pass");
		}
		else
			System.out.println("is unselected====fail");
	}

}
