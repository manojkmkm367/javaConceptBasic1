package org.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlartTrining {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		WebElement edit=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[9]/a/img"));
		edit.click();
		
		WebElement alertBoxButton = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertBoxButton.click();
	Thread.sleep(1000);
		Alert alertBox = driver.switchTo().alert();
		alertBox.accept();
		
		WebElement confirmBoxButton = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		confirmBoxButton.click();
	Thread.sleep(1000);
		 Alert confirmBox= driver.switchTo().alert();
		 confirmBox.dismiss();
		 
		 WebElement promptBoxButton = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		 promptBoxButton.click();
	Thread.sleep(1000);
		Alert promptAlart = driver.switchTo().alert();
		promptAlart.sendKeys(" testing done");
		Thread.sleep(1000);
		promptAlart.accept();
		
		}
}
