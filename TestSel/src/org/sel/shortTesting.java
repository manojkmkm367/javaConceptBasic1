package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class shortTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/sortable.html");
		
		List<WebElement> formList = driver.findElements(By.xpath("//*[@id=\'sortable\']/li"));
		
		WebElement fromItem =  formList.get(6);
		WebElement toItem = formList.get(0);
		
		Actions actions= new Actions(driver);
		
//		actions.clickAndHold(fromItem);
//		actions.moveToElement(toItem);
//		actions.release();
//		actions.build().perform();
				
		actions.dragAndDrop(fromItem, toItem).build().perform();

	}

}
