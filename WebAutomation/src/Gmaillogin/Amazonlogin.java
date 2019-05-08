package Gmaillogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonlogin {
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://Amazon.com");
		WebElement wb=driver.findElement(By.id("nav-link-accountList"));
		wb.click();
		WebElement emailwb=driver.findElement(By.id("ap_email"));
		emailwb.sendKeys("savitha.v14@gmail.com");
		WebElement pswb=driver.findElement(By.id("ap_password"));
		pswb.sendKeys("keerthi1985@");
		Thread.sleep(2000);
		WebElement signinwb=driver.findElement(By.id("signInSubmit"));
		signinwb.click();
		Thread.sleep(5000);
	}

}
