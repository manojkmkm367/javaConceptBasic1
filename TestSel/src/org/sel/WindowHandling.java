package org.sel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		WebElement windowButton=	driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[11]/a/img"));
		windowButton.click();
//		**** SWITCH CONTROL TO NEW WINDOW 
		String mainWindowControl =driver.getWindowHandle();
		WebElement homePageButton = driver.findElement(By.id("home"));
		homePageButton.click();
		
		Set<String> currentAllWindow = driver.getWindowHandles();
		
		for (String newWindow1 : currentAllWindow) {
			driver.switchTo().window(newWindow1);
		}
		
		WebElement newlyOpenWindow = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		newlyOpenWindow.click(); Thread.sleep(1000);
		driver.close();
		
		driver.switchTo().window(mainWindowControl);
		
		WebElement multipleWindowCounting = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		multipleWindowCounting.click();
		
		Set<String>  newlyOpenWindow1 = driver.getWindowHandles();
		int newlyOpenWindow1Size = newlyOpenWindow1.size(); 
		System.out.println("newlyOpenWindow Size :"+newlyOpenWindow1Size);
		
		WebElement closeWindow = driver.findElement(By.id("color"));
		closeWindow.click();
		
		Set<String> newlyOpenWindow3 =  driver.getWindowHandles();
		
		for (String newWindow1 : newlyOpenWindow3) {
			
			if ( ! newWindow1.equals(mainWindowControl))
			{
				driver.switchTo().window(newWindow1);
				Thread.sleep(500);
				System.out.println(newWindow1);
				driver.close();
			}
			
		}

	}

}
