package Gmaillogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Savitha/Desktop/text.HTML.HTML");
		WebElement wb=driver.findElement(By.xpath("//select[@multiple='true']"));
		Select sel=new Select(wb);
		if(sel.isMultiple())
		{
			System.out.println("its multiselect dropdown");
			for(int i=0; i<9; i++)
			{
				sel.selectByIndex(i);
			}
		}else
		{
			System.out.println("its not multiselect");
		
}
		
	}

}
