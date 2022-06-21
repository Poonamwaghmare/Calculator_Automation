package pages_file;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calculate_Substraction {
	
	WebDriver driver;
		
	public Calculate_Substraction(WebDriver driver) {
		
	this.driver = driver;
		
	}
		
	//Locators for Addition
	
	By value1 = By.xpath("//span[contains(text(),'2')]");
	By value2 = By.xpath("//span[contains(text(),'3')]");
	By value3 = By.xpath("//span[contains(text(),'4')]");
	By value4 = By.xpath("//span[contains(text(),'8')]");
	By value5 = By.xpath("//span[contains(text(),'2')]");
	By value6 = By.xpath("//span[contains(text(),'3')]");
	
	//Locators for Subtraction button
	By value7 = By.xpath("//span[contains(text(),'–')]");
	
	//Locators for Subtraction button
	
	By value8 =  By.xpath("//span[contains(text(),'–')]");

	By value9 = By.xpath("//span[contains(text(),'2')]");
	By value10 =  By.xpath("//span[contains(text(),'3')]");
	By value11 =  By.xpath("//span[@class='scinm'][contains(text(),'0')]");
	By value12 = By.xpath("//span[contains(text(),'9')]");
	By value13 = By.xpath("//span[contains(text(),'4')]");
	By value14 = By.xpath("//span[contains(text(),'8')]");
	By value15 = By.xpath("//span[contains(text(),'2')]");
	By value16 =  By.xpath("//span[contains(text(),'3')]");
	
	By value17 = By.xpath("//span[contains(text(),'=')]");
	
	By value18 = By.xpath("//div[@id='sciOutPut']");
	
	
	
	public void substraction() throws InterruptedException {
		//Clicking on integers
		driver.findElement(value1).click();
		driver.findElement(value2).click();
		driver.findElement(value3).click();
		driver.findElement(value4).click();
		driver.findElement(value5).click();
     	driver.findElement(value6).click();
		driver.findElement(value7).click();
		
		
//		//Clicking on addition button
	    driver.findElement(value8).click();
//		
//		//Clicking on integers
		driver.findElement(value9).click();
		driver.findElement(value10).click();
     	driver.findElement(value11).click();
		driver.findElement(value12).click();
		driver.findElement(value13).click();
		driver.findElement(value14).click();
		driver.findElement(value15).click();
		driver.findElement(value16).click();
		
//		//Clicking on the equals to button
//		
    	driver.findElement(value17).click();
		Thread.sleep(3000);
		
		//driver.findElement(value18).click();
		
	}
	
	}


