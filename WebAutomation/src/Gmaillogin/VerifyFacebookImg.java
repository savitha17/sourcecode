package Gmaillogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyFacebookImg {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		boolean status=driver.findElement(By.xpath("//img[@src='https://static.xx.fbcdn.net/rsrc.php/v3/yi/r/OBaVg52wtTZ.png']")).isDisplayed();
		System.out.println(status);
		if(status)
		{
			System.out.println("image is displayes--- pass");
		}
		else
		{
			System.out.println("image is not displayed----fail");
		}
		driver.close();
		
	}
	
	
	

}
