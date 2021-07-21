package testngFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ThreadSleep {
	WebDriver driver;
	@Test
	public void a_pageLoad() {
        System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void b_googlesearch() throws InterruptedException{
		driver.findElement(By.name("q")).sendKeys("sachin Tedulkar");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h3[contains(text(),'Sachin Tendulkar - Wikipedia')]")).click();
		
	}
}
