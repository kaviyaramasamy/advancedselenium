package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver"," E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement upload=driver.findElement(By.id("uploadfile_0"));
	    upload.sendKeys("C:\\Users\\sugan\\OneDrive\\Pictures\\Saved Pictures\\1 pic.jpg");
	    WebElement chose=driver.findElement(By.id("terms"));
	    chose.click();
	    driver.findElement(By.id("submitbutton")).click();

	}

}
