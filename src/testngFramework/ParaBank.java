package testngFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ParaBank {

WebDriver driver;
       @BeforeSuite
       public void a_pageload() {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		driver.manage().window().maximize();
       }
       @Test
       public void b_parabank() {
		driver.findElement(By.id("customer.firstName")).sendKeys("Kaviya");
		driver.findElement(By.id("customer.lastName")).sendKeys("Baskar");
		driver.findElement(By.id("customer.address.street")).sendKeys("1/115,Anbhu Nagar");
		driver.findElement(By.id("customer.address.city")).sendKeys("Namakkal");
		driver.findElement(By.id("customer.address.state")).sendKeys("TamilNadu");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("678673");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("9566223090");
		driver.findElement(By.id("customer.ssn")).sendKeys("1234-23-2123");
		driver.findElement(By.id("customer.username")).sendKeys("KaviyaRamasamy");
		driver.findElement(By.id("customer.password")).sendKeys("Cjjjef@876");
		driver.findElement(By.id("repeatedPassword")).sendKeys("Cjjjef@876");
		driver.findElement(By.xpath("//b[text()='Confirm:']/following::input[2]")).click();
       }
       @AfterSuite
       public void c_browserclosure() {
    	   driver.quit();
       }
	}

