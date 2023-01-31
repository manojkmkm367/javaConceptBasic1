package org.sel;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		WebElement edit=	driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/h5"));
		edit.click();
		//***********FIND BUTTON POSITION USING GETLOCATION OPTION ***********

		WebElement buttonPosition = driver.findElement(By.id("position"));
		Point xyPosition= buttonPosition.getLocation();
		int xPoint1 =buttonPosition.getLocation().getX();
		int yPoint1= buttonPosition.getLocation().getY();
		int xPoint = xyPosition.getX();
		int yPoint =xyPosition.getY();
		System.out.println("Location -- -- -->  x = "+xPoint + " & y = "+yPoint);
		System.out.println("ConformLocation ->  x = "+xPoint1 + " & y = "+yPoint1);

		// ***** FIND BUTTON COLOR *************
		WebElement buttonColor = driver.findElement(By.id("color"));
		String buttonclr =  buttonColor.getCssValue("background-color");
		System.out.println(buttonclr);

		// *****  FIND BUTTON SIZE  **********
		WebElement buttonSize = driver.findElement(By.id("size"));
		int height = buttonSize.getSize().getHeight();
		int width = buttonSize.getSize().getWidth();
		System.out.println("Height = " +height + " Width = "+ width );

		// PRESS HOME BUTTON
		WebElement homebutton = driver.findElement(By.id("home"));
		homebutton.click();


	}

}
