package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		WebElement radioButton=	driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[6]/a/img"));
		 radioButton.click();
		// # TO CHECK WHETHER BOX IS SELECTED OR NOT   // # TO IDENTIFYING WHICH BUTTONS SELECTED DEFAULT
		 
		 WebElement defaultBox1 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input[1]"));
		 WebElement defaultBox2= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[2]"));
		boolean box1States = defaultBox1.isSelected();
		boolean box2States = defaultBox2.isSelected();
		 System.out.println(" Box1 selected = "+box1States + "\n Box2 selected = "+box2States);
		 
		 // # TO CLICKING RADIO BUTTON 
		 WebElement ageGroup = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[1]"));
		 ageGroup.click();
		 
		  Thread.sleep(5000); driver.quit();
	}

}
