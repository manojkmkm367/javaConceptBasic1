package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesTesting {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		WebElement framesButton=	driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[10]/a/img"));
		framesButton.click();
		
//		########### SWITCH CONTROL FROM MAIN HTML PAGE TO FRAME PAGE 
		
		driver.switchTo().frame(0);
		WebElement firstButtonElement = driver.findElement(By.id("Click"));
		firstButtonElement.click();
		String buttonText= firstButtonElement.getText();
		System.out.println(buttonText);
		
//		RETURN TAKING OF CONTROL TO MAIN PAGE
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
	WebElement frame2button = driver.findElement(By.id("Click1"));
	frame2button.click();
		driver.switchTo().defaultContent();
		
		
		List<WebElement> iframeList =driver.findElements(By.tagName("iframe"));
		int sizeOfList = iframeList.size();
		
	System.out.println(sizeOfList);
	
		

	}

}
