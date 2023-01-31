package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hyperLinkTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
//		driver.get("http://www.leafground.com/pages/Image.html");
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		
		WebElement findWhere =driver.findElement(By.partialLinkText("Find where am"));
	 String findWhereLinkHREF =	findWhere.getAttribute("href");
	 System.out.println("Next Page link --> "+findWhereLinkHREF);
	 
	 
//	 ******** Finding error page Using get title-------------------------------
	 WebElement brockenLink = driver.findElement(By.partialLinkText("Verify am I broken"));
	 brockenLink.click();
	String pageTitle= driver.getTitle();
	
	if (pageTitle.contains("404")) {
		System.out.println("Page 404 Error ");
		
	}else {
		System.out.println("Page runningg....");
	}
	Thread.sleep(1000);
	driver.navigate().back();
//-----------------------------click home page and back---------------------------------------
	WebElement homePage = driver.findElement(By.partialLinkText("Home Page"));
	homePage.click();
	driver.navigate().back();
//	------------get totel link in this Page--------------
	List<WebElement> totLink = driver.findElements(By.tagName("a"));
	System.out.println("Total Link : "+totLink.size());
	 int i=1;
	for (WebElement webElement : totLink) {
		System.out.println(i+webElement.getText()); i++;
	}


		
		
	}

}
