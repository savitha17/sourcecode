package Gmaillogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureJavaWebDriverVersion {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/download/");
		String ver=driver.findElement(By.xpath("//td[text()='Java']/following-sibling::td[1]")).getText();
		System.out.println(ver);
		String rd=driver.findElement(By.xpath("//td[text()='Java']/following-sibling::td[2]")).getText();
		System.out.println(rd);
		
	} 

}
