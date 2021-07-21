package testngFramework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakingScreenshot {
public WebDriver driver;
	
    @Test 
    public void a_pageLoad() {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
    }
    @Test
    public void b_login() throws IOException, InterruptedException {
    	driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(20000);
		getscreenshot();
    }
    private void getscreenshot() throws IOException {

   File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
   FileUtils.copyFile(scrFile, new File("D:\\selenium\\screenshot\\screenshot" +System.currentTimeMillis()+ ".png"));

    }
    
}
