package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadTesting {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");
		System.out.println(" page open");
		WebElement uploadButton = driver.findElement(By.name("filename"));
		System.out.println(" button find");
		uploadButton.click();
		System.out.println(" button clicked");
		driver.quit();
	}

}
