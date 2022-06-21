package pages_file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calculate_Multiplication {
	
	WebDriver driver;
		
	public Calculate_Multiplication(WebDriver driver) {
		
	this.driver = driver;
		
	}
		
    //Locators for Multiplication
	By value1 = By.xpath("//span[contains(text(),'4')]");
	By value2 = By.xpath("//span[contains(text(),'2')]");
	By value3 = By.xpath("//span[contains(text(),'3')]");
	
	By value4 = By.xpath("//span[contains(text(),'×')]");
	
	By value5 =  By.xpath("//span[contains(text(),'5')]");
	By value6 = By.xpath("//span[contains(text(),'2')]");
	By value7 = By.xpath("//span[contains(text(),'5')]");
	
	By value8 = By.xpath("//span[contains(text(),'=')]");
	//By value9 = By.xpath("//div[@id='sciOutPut']");

	
	
	
	public void Multiplication() throws InterruptedException {
		//Clicking on integers
		driver.findElement(value1).click();
		driver.findElement(value2).click();
		driver.findElement(value3).click();
		
		//Thread.sleep(3000);
				
		
//		//Clicking on Multiplication button
		driver.findElement(value4).click();
		
		//Clicking on integers
		driver.findElement(value5).click();
		driver.findElement(value6).click();
		driver.findElement(value7).click();
		
		
//		//Clicking on the equals to button
		driver.findElement(value8).click();	
	//	driver.findElement(value9).click();
		
		Thread.sleep(2000);
		
	}
	
	}


