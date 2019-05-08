package Gmaillogin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataDrivenProperties {
	
public static void main(String[] args) throws IOException, InterruptedException {
FileInputStream fis=new FileInputStream("./data/Commondata.properties");
Properties pObj=new Properties();
pObj.load(fis);
String URL=pObj.getProperty("url");
String USER=pObj.getProperty("username");
String PASSWORD=pObj.getProperty("password");
String BROWSER=pObj.getProperty("browser");
WebDriver driver=null;
if(BROWSER.equals("Chrome"))
{
	driver=new ChromeDriver();
}else if(BROWSER.equals("Firefox"))
{
driver=new FirefoxDriver();
	}



// Login

driver.get(URL);
Thread.sleep(5000);
driver.findElement(By.name("identifier")).sendKeys(USER);
driver.findElement(By.xpath("//span[text()='Next']")).click();
Thread.sleep(5000);
driver.findElement(By.name("password")).sendKeys(PASSWORD);
driver.findElement(By.xpath("//span[text()='Next']")).click();
driver.close();
}
}


