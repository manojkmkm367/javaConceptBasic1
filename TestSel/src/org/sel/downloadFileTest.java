package org.sel;

import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class downloadFileTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.istockphoto.com/photo/funny-friends-cute-cat-and-corgi-dog-are-lying-on-a-white-bed-together-gm1347494018-424975527?utm_source=unsplash&utm_medium=affiliate&utm_campaign=category_photos_top&utm_content=https%3A%2F%2Funsplash.com%2Fimages&utm_term=images%3A%3A%3A");
		String mainWindowControl =driver.getWindowHandle();
		WebElement imgDownload= driver.findElement(By.xpath("/html/body/div[2]/section/div/main/div/div/div/div[2]/section[2]/section[1]/div/button[2]"));
		imgDownload.click(); // clicking download button - Then popup open
		Thread.sleep(1000);
		
		Set<String> totControl = driver.getWindowHandles(); // send control to alart window
		
		for (String cnt : totControl) {
			driver.switchTo().window(cnt);
			
		}
		
		WebElement tikBox= driver.findElement(By.className("Checkbox-module__checkboxInput___JCxoH"));
		tikBox.click();    // alart box ticked - for conformation for download
		WebElement downloadButton = driver.findElement(By.xpath("//*[@id=\'modal-root\']/div/div/footer/div/a")); 	
		downloadButton.click();   // download button clicked  and file downloaded
		driver.switchTo().window(mainWindowControl);
		
		//-------FINDING FILE DOWNLOADED OR NOT-----------------------------------------------------------------------------------------------------------------
		File fileLocation = new File("C:\\Users\\dell\\Downloads");		// location of the downloaded file
		File[] totFiles = fileLocation.listFiles();        
		for (File tempFile : totFiles) {
			System.out.println(tempFile.getName());
			if (tempFile.getName() .equals("istockphoto-1347494018-1024x1024.jpg")) {
				
				System.out.println(" File downloaded sucessfully...");
				break;
				
			}
			
		}
		
	}

}
