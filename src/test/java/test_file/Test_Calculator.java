package test_file;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;  
import org.testng.annotations.Test;

import pages_file.Calculate_Addition;
import pages_file.Calculate_Division;
import pages_file.Calculate_Multiplication;
import pages_file.Calculate_Substraction;  
  
public class Test_Calculator   
{  WebDriver driver;
      
  @BeforeTest                                               
  public void before_test()  
  {  
      System.setProperty("webdriver.chrome.driver", "D:\\Chrome_driver\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("https://www.calculator.net/");
      driver.manage().window().maximize();
  }  
  @Test  
  public void run_addition() throws InterruptedException  
  {  
	  Calculate_Addition caladdition = new Calculate_Addition(driver);
	  caladdition.addition();
	  
  }  
    
  @Test  
  public void run_division() throws InterruptedException  
  {  
	  Calculate_Division caldivision = new Calculate_Division(driver);
	  caldivision.division();
  }  
    
  @Test  
  public void run_multiplication() throws InterruptedException  
  {  
	  Calculate_Multiplication calmultiplication = new Calculate_Multiplication(driver);
	  calmultiplication.Multiplication();
  }
  
  @Test  
  public void run_substraction() throws InterruptedException  
  {  
	  Calculate_Substraction calsubstraction = new Calculate_Substraction(driver);
	  calsubstraction.substraction();
  }
  
  @AfterTest
  
  public void close_calculator() {
	  
	  driver.close();
	  
  }
  


}  