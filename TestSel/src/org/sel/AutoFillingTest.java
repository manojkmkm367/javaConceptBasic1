package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoFillingTest {

	public static void main(String[] args) throws InterruptedException {
				
			System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		WebElement textBox = driver.findElement(By.id("tags"));
		textBox.sendKeys("s");
		Thread.sleep(2000);
		List<WebElement> listOfEle = textBox.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		System.out.println(listOfEle.size());
		
		for (WebElement tempElement : listOfEle) {
			if (tempElement.getText().equals("SOAP" )) {
				tempElement.click();
				break;
							}
			
		}
	}

}
