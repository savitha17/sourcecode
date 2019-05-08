package Gmaillogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementIdentification {
	
public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://gmail.com");
		System.out.println("--------START LOGIN------------");
		WebElement emailWb= driver.findElement(By.id("identifierId"));
		emailWb.sendKeys("savitha.v14@gmail.com");
		WebElement btnWb= driver.findElement(By.xpath("//span[text()='Next']"));
		btnWb.click();
		Thread.sleep(2000);
		WebElement pswWb=driver.findElement(By.name("password"));
		pswWb.sendKeys("keerthi1985@");
		WebElement btn2Wb= driver.findElement(By.xpath("//span[text()='Next']"));
		btn2Wb.click();
		Thread.sleep(5000);
		WebElement imgWb= driver.findElement(By.xpath("//span[@class='gb_ya gbii']"));
		imgWb.click();
		WebElement logoutbtnWb= driver.findElement(By.id("gb_71"));
		logoutbtnWb.click();
		driver.quit();
		System.out.println("--------END------------");
				
	}

}
