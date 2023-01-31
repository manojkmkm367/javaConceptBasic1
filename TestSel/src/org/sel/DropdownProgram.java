  package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownProgram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		WebElement edit=	driver.findElement(By.xpath
			("//*[@id=\"post-153\"]/div[2]/div/ul/li[5]/a"));	edit.click();
			
			WebElement dropdown1= driver.findElement(By.id("dropdown1"));
			Select select = new Select(dropdown1);
			select.selectByIndex(1); Thread.sleep(500);
			select.selectByValue("3"); Thread.sleep(500);
			select.selectByVisibleText("Appium");Thread.sleep(500);
			dropdown1.sendKeys("Loadrunner");
			
			List<WebElement> dropdownBoxList= select.getOptions();
			int boxSize =dropdownBoxList.size();
			System.out.println(" BoxSize : "+dropdownBoxList.size()+ " = same as = "+boxSize);
			
			WebElement multiSelect= driver.findElement(
					By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
			
			Select boxSelect= new Select(multiSelect);
			multiSelect.sendKeys("Loadrunner");
			boxSelect.selectByIndex(1);
			boxSelect.selectByIndex(2);
			
			
			
			  Thread.sleep(5000); driver.quit();

	}

}
