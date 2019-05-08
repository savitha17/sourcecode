package Gmaillogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyInvalidEmail {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		//verify
		String exptitle="Gmail";
		String acttitle=driver.getTitle();
		if(exptitle.equals(acttitle))
		{
			System.out.println("login page is displayed==pass");
			}
		else
			{
				System.out.println("login page is not displayed==fail");
			}
			//enter invalid email and click on next button
		driver.findElement(By.id("identifierId")).sendKeys("gh");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);
		//verify
		String expmsg="could not find your google account";
		WebElement wb=driver.findElement(By.xpath("//div[@class='GQ8Pzc'"));
		String actmsg=wb.getText();
		if(expmsg.equals(actmsg))
		{
			System.out.println("error msg is displayed ==pass");
		}
		else
		{
			System.out.println("error msg is displayed ==Fail");
		}
		System.out.println("actmsg");
		String actcolor=wb.getCssValue("color");
		System.out.println("actcolor");
		driver.close();
		
	}
	}
	



