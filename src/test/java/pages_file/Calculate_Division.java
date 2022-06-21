package pages_file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calculate_Division {
	
	WebDriver driver;
		
	public Calculate_Division(WebDriver driver) {
		
	this.driver = driver;
		
	}
		
    //Locators for Division
	By value1 = By.xpath("//span[contains(text(),'4')]");
	By value2 = By.xpath("//span[@class='scinm'][contains(text(),'0')]");
	By value3 = By.xpath("//span[@class='scinm'][contains(text(),'0')]");
	By value4 = By.xpath("//span[@class='scinm'][contains(text(),'0')]");
	
	By value5 =  By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[4]");
	
	By value6 = By.xpath("//span[contains(text(),'2')]");
	By value7 = By.xpath("//span[@class='scinm'][contains(text(),'0')]");
	By value8 = By.xpath("//span[@class='scinm'][contains(text(),'0')]");
	
	By value9 = By.xpath("//span[contains(text(),'=')]");
	By value10 = By.xpath("//div[@id='sciOutPut']");

	
	
	
	public void division() throws InterruptedException {
		//Clicking on integers
		driver.findElement(value1).click();
		driver.findElement(value2).click();
		driver.findElement(value3).click();
		driver.findElement(value4).click();
		//Thread.sleep(3000);
				
		
//		//Clicking on division button
		driver.findElement(value5).click();
		
		//Clicking on integers
		driver.findElement(value6).click();
		driver.findElement(value7).click();
		driver.findElement(value8).click();
		
		
//		//Clicking on the equals to button
		driver.findElement(value9).click();	
		driver.findElement(value10).click();
		
		Thread.sleep(2000);
		
	}
	
	}


