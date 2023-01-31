package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipTesting {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		WebElement toolTipButton=	driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[20]/a/img"));
		toolTipButton.click();
		
		WebElement toolTip = driver.findElement(By.id("age"));
	String textIn=	toolTip.getAttribute("title");
	System.out.println(textIn);
	
	driver.quit();
	}

}
