package Gmaillogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LGAirconditioner {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='✕']")));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement wb=driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		Actions act=new Actions(driver);
		act.moveToElement(wb).perform();
		WebDriverWait wait1=new WebDriverWait(driver,20);
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title='LG' and contains(@href,'televisions')]")));
		driver.findElement(By.xpath("//a[@title='LG' and contains(@href,'televisions')]")).click();
		
		
		
	}	
		
}
