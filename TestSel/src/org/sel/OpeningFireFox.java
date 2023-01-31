package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpeningFireFox {
	public static void main (String[] args) {
	//System.getProperty("webdriver.gecko.driver","C:\\Users\\dell\\Downloads\\geckodriver.exe");
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("agni"+Keys.ENTER);
		
		//driver.quit();
				
	}
}
