package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yourlogosignin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		driver.findElement(By.id("email")).sendKeys("nalanbasky20@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Nandhini@123");
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//b[contains(text(),'Cart')]/preceding::a[3]")).click();
	
	}

}
