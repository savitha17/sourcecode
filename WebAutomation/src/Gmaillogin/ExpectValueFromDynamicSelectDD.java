package Gmaillogin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExpectValueFromDynamicSelectDD {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Savitha/Desktop/text.HTML.HTML");
		String expVal="shellscript";
		//boolean flag=false;
		WebElement wb=driver.findElement(By.xpath("//select[@multiple='true']"));
		Select sel=new Select(wb);
		List<WebElement> lst=sel.getOptions();
		for(int i=0; i<lst.size(); i++)
		{
			String actVal=lst.get(i).getText();
			if(expVal.equals(actVal))
			{
				sel.selectByVisibleText(actVal);
			//	flag=true;
			//	break;
			}
		}
	//if(flag==true)
	//	{
	//		System.out.println("value is available pass");
	//	}
	//	else
		//{
		//	System.out.println("value is not available fail");
		//}*//
	}
	}
