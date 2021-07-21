package testngassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwagLabs {
	WebDriver driver;
	    @Test (priority=1)
	    public void pageLoad() {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	    }
	    @Test (priority=2)
	    public void signIn() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	    }
	    @Test (priority=3)
	    public void signOut() throws InterruptedException { 
	    driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("logout_sidebar_link")).click();

	}

}
