package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class calanderTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Calendar.html");

		
		WebElement calanderHtml= driver.findElement(By.id("datepicker"));
		//calanderHtml.sendKeys("05/15/1997" +Keys.ENTER); // using sendKey to enter date
		
		calanderHtml.click();
		// //a[@title='Next']
	 WebElement nextButton = 	driver.findElement(By.xpath("//a[@title='Next']"));
	 nextButton.click();
	 
	 // //a[contains(text(),'10')]   
	 
	 WebElement date10 = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
	 date10.click();
	 

	}

}
