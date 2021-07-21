package automationFramework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/#");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[contains(text(),'Create an account')])[1]")).click();
		ArrayList <String> gmail=new ArrayList <String>(driver.getWindowHandles());
		driver.switchTo().window(gmail.get(1));
		driver.findElement(By.id("firstName")).sendKeys("nalan");
		driver.findElement(By.id("lastName")).sendKeys("baskar");
		driver.findElement(By.id("username")).sendKeys("nalanbaskar2007");
		driver.findElement(By.name("Passwd")).sendKeys("Ice@98cresm");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("Ice@98cresm");
	    WebElement chose=driver.findElement(By.xpath("//div[contains(text(),'Show password')]/preceding::input[1]"));
	    chose.click();
	    driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		

	}

}
