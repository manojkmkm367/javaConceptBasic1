package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadTest1 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");
		WebElement uploadButton = driver.findElement(By.name("filename"));
		//WebElement butt = driver.findElement(By.xpath("//*[@id=\"mydiv\"]/input"));
		System.out.println(uploadButton.getTagName());
		Actions action = new Actions(driver);
		action.click(uploadButton).build().perform();
//		butt.click();
		
		StringSelection fileLoct = new StringSelection("C:\\Users\\dell\\Downloads\\istockphoto-1347494018-1024x1024");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileLoct, null);
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
	}

}
