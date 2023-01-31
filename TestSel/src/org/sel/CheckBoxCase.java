package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxCase {

	public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		WebElement checkBoxButton=	driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[7]/a/img"));
		checkBoxButton.click();
		// ### Choose Multiple Box 
		WebElement firstBoxE1 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[1]"));
		firstBoxE1.click();
		WebElement firstBoxE3 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[3]"));
		firstBoxE3.click();
		
		//	###### Get Box States
		
		WebElement secondBox = driver.findElement(By.xpath( "//*[@id=\'contentblock\']/section/div[2]/input"));
		boolean secondBoxStates = secondBox.isSelected();
		System.out.println(" Selenium Box is Ticked : "+secondBoxStates);
		
		// ##### Unselect Box which one is selected
		
		WebElement thirdBoxE1 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[1]"));
		WebElement thirdBoxE2 =driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[2]"));
		if(thirdBoxE1.isSelected())
		{ 
			thirdBoxE1.click();
		}
		if(thirdBoxE2.isSelected())
		{
			thirdBoxE2.click();
		}
		
	
	}

}
