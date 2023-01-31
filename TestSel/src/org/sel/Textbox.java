package org.sel;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
	WebElement edit=	driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
	 edit.click();
	 
	WebElement emailBox= driver.findElement(By.id("email"));
	emailBox.sendKeys("manojkmkm367@gmail.com");
	
	WebElement appendBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
	appendBox.sendKeys(" Done successfully");
		
	WebElement textBox= driver.findElement(By.name("username"));
	String textboxValue = textBox.getAttribute("value");
	System.out.println(" Value taken from the Box : " +textboxValue);
	
	WebElement clearBox= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
	clearBox.clear();
	
	WebElement boxCondition = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input")); 
	//String boxValue = boxCondition.getAttribute("disabled");
	boolean boxEnable =  boxCondition.isEnabled();
	boxCondition.isDisplayed();
	System.out.println(" Box is enabled ? -> "+ boxEnable);
	
		//driver.quit();

	}

}
