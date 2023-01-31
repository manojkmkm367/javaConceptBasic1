package org.sel;

import javax.annotation.processing.SupportedSourceVersion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class imageTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");

		WebElement brokenImg = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
		
		if (brokenImg.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("broaken.....");
		}else {
			System.out.println("Not broken....");
		}
		WebElement homeButton = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		
		if (homeButton.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("broaken.....");
		}else {
			System.out.println("Not broken....");
			homeButton.click();
		}
	}

}
