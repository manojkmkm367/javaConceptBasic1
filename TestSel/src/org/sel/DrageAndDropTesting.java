package org.sel;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrageAndDropTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		WebElement drageDropButton=	driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[14]/a/img"));
		drageDropButton.click();
		
		WebElement fromBox = driver.findElement(By.id("draggable"));
		WebElement toBox = driver.findElement(By.id("droppable"));
		 WebElement homeBox = driver.findElement(By.id("mydiv"));
		  
		int yLoc= fromBox.getLocation().getX();
		 int xLoc =fromBox.getLocation().getY();
		 
		 
		Actions action = new Actions(driver);
		
	//	action.clickAndHold(fromBox).moveToElement(toBox).release() .build().perform();
		
		action.dragAndDrop(fromBox, toBox).build().perform();

	}

}
