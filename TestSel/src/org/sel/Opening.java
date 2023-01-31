package org.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opening {

	public static void main(String[] args) throws InterruptedException {
  /* System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver.exe");
   WebDriver driver= new ChromeDriver();
//WebDriver driver= new ChromeDriver();
   driver.get("http://www.greenstechnologys.com/"); */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		//driver.get("https://www.w3schools.com/");
		//driver.findElement(By.name("q")).sendKeys("https://www.flipkart.com/"+Keys.ENTER);
      
		driver.findElement(By.partialLinkText("Home Page")).click();
		
		
		//driver.quit();
		
	}

}
