package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selectableTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		WebElement selectableButton=	driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[15]/a/img"));
		selectableButton.click();
		//*[@id="selectable"]/li[1]   //*[@id="selectable"]/li[1]

		List<WebElement> selectableList = driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		int sizeOf =selectableList.size();
		System.out.println(sizeOf);
		
		Actions action = new Actions(driver);
		
//		** FIRST WAY OF SELECTABLE 
		action.keyDown(Keys.CONTROL).click(selectableList.get(0))
		.click(selectableList.get(1)).click(selectableList.get(3)).build().perform();
//		** SECOND WAY OF SELECTABLE  USING KEY CLICKANDHOLD	
		action.clickAndHold(selectableList.get(5));
		action.clickAndHold(selectableList.get(6));
		action.build().perform();
		
		//driver.quit();
	}

}
