package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YourLogoFeedBack {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//b[contains(text(),'Cart')]/preceding::a[2]")).click();
		Select chose=new Select(driver.findElement(By.id("id_contact")));
		chose.selectByVisibleText("Webmaster");
		driver.findElement(By.id("email")).sendKeys("nalanbasky20@gmail.com");
		driver.findElement(By.id("id_order")).sendKeys("12sy45444g");
		WebElement Upload=driver.findElement(By.id("fileUpload"));
		Upload.sendKeys("D:\\selenium\\sel\\ancestor.png");
		driver.findElement(By.id("message")).sendKeys("Hello,GoodMorning,ThankYou");
		Thread.sleep(5000);
		driver.findElement(By.id("submitMessage")).click();
	}

}
