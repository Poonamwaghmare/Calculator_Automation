package pages_file;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calculate_Addition {
	
	WebDriver driver;
		
	public Calculate_Addition(WebDriver driver) {
		
	this.driver = driver;
		
	}
		
	//Locators for Addition
	By value1 = By.xpath("//span[contains(text(),'–')]");
	By value2 = By.xpath("//span[contains(text(),'2')]");
	By value3 = By.xpath("//span[contains(text(),'3')]");
	By value4 = By.xpath("//span[contains(text(),'4')]");
	By value5 = By.xpath("//span[contains(text(),'2')]");
	By value6 = By.xpath("//span[contains(text(),'3')]");
	By value7 = By.xpath("//span[contains(text(),'4')]");
	
	By value8 =  By.xpath("(//span[contains(text(),'+')])[1]");
	
	By value9 =  By.xpath("//span[contains(text(),'3')]");
	By value10 = By.xpath("//span[contains(text(),'4')]");
	By value11 = By.xpath("//span[contains(text(),'5')]");
	By value12 = By.xpath("//span[contains(text(),'3')]");
	By value13 = By.xpath("//span[contains(text(),'4')]");
	By value14 = By.xpath("//span[contains(text(),'5')]");
	
	By value15 = By.xpath("//span[contains(text(),'=')]");
	
	By value16 = By.xpath("//div[@id='sciOutPut']");
	
	
	
	public void addition() throws InterruptedException {
		//Clicking on integers
		driver.findElement(value1).click();
		driver.findElement(value2).click();
		driver.findElement(value3).click();
		driver.findElement(value4).click();
		driver.findElement(value5).click();
		driver.findElement(value6).click();
		driver.findElement(value7).click();
		
		
		//Clicking on addition button
		driver.findElement(value8).click();
		
		//Clicking on integers
		driver.findElement(value9).click();
		driver.findElement(value10).click();
		driver.findElement(value11).click();
		driver.findElement(value12).click();
		driver.findElement(value13).click();
		driver.findElement(value14).click();
		
		//Clicking on the equals to button
		driver.findElement(value15).click();
		Thread.sleep(3000);
		
		driver.findElement(value16).click();
		
	}
	
	}


