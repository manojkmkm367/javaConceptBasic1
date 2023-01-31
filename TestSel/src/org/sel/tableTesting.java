package org.sel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/table.html");
		
	  List<WebElement> cloumsList =	driver.findElements(By.tagName("th"));
	  List<WebElement> rowsList = driver.findElements(By.tagName("tr"));
	  System.out.println("cloums : "+ cloumsList.size() +"   rows : "+rowsList.size());
	  
// -----------Find columns in the Table using Text present in those or nearby colums ---------------	  
	//*[@id="contentblock"]/section/div[1]/table/tbody/tr[3]/td[1]/font
//	"//td[ normalize-space()='Learn to interact with Elements']//following::td[1]"  xPath 
		
	WebElement learnToInt =  driver.findElement(By.xpath("//td[ normalize-space()='Learn to interact with Elements']//following::td[1]"));
	
	System.out.println(learnToInt.getText());
	
//	---------------------------------------------------------------------------------------------------
	
	//*[@id="contentblock"]/section/div[1]/table/tbody/tr[3]/td[2] 
	
	List<WebElement> listOfValues = driver.findElements(By.xpath("//td[2]"));
	System.out.println("size : "+listOfValues.size());
	List<Integer> listOfValuesInt = new ArrayList<Integer>();
	
	for (WebElement webElementList : listOfValues) {
		String temp1 = webElementList.getText().replace("%", "");
		int temp = Integer.parseInt(temp1);
		listOfValuesInt.add(temp);
		
	}
	int smallValue = Collections.min(listOfValuesInt);
	
System.out.println( "small Value "+smallValue);
 //td[normalize-space()='20%']//following::td[1]

String smallValStr = Integer.toString(smallValue)+"%";

String finalPath = "//td[normalize-space()='"+smallValStr+"']//following::td[1]";

WebElement finalBox = driver.findElement(By.xpath(finalPath));
finalBox.click();


	
	
	

	}

}
